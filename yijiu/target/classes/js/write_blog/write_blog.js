function add_lable(){
	$('#lable-caveat').html("");
	var article_al=document.getElementById("article-al").getElementsByTagName("button");
	if(article_al.length<3){
		var articleLabel =$("#article_label_add");
		lable_add(articleLabel)
	}else{
		$('#lable-caveat').html("最多添加3个标签");
	}
	
}
function lable_add(articleLabel){
	 if(articleLabel.val().trim() != ""){
	 	 bt=document.createElement("button");
	 	 bt.style.marginLeft = '5px';
	 	 sp=document.createElement("a");
	 	 sp.innerHTML="x";
	 	 bt.id=articleLabel.val().trim();
         sp.setAttribute("onclick", "lable_rm('"+articleLabel.val().trim()+"')"); 
		 bt.innerHTML=articleLabel.val().trim()+"&nbsp";
		 bt.appendChild(sp);
		 document.getElementById("article-al").appendChild(bt);
		 articleLabel.val("");
	 }
}
function lable_rm(id){
	document.getElementById("article-al").removeChild(document.getElementById(id)); 
}
function addblog(){
	var label="";//文章标签
	var type_select=$('.article-type option:selected');
	var type=type_select.attr('id');
	var title=$('#article_title').val();
	var content=editor.getValue();
	alert(content);
	//获取标签div中所有的button
	var article_al=document.getElementById("article-al").getElementsByTagName("button");
	for( var i=0;i<article_al.length;i++){
		label=label+article_al[i].id+" ";
	}
	$.ajax({
		type: "POST",
		url: "http://localhost:8080/yijiu/blog/addBlog.do",
		data: {
			 content:content,
			  type:type,
			  label:label,
			  title:title
		},
		dataType: "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success: function(data) {
			alert("发表成功")
		},
		error: function(data) {
			alert("发表失败")
		}
	});
}
	
