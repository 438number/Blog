function sendCode(){
	var email=$('#email').val().trim();
	sendCodeAjax(email);
	alert(email)
}
function sendCodeAjax(username){
	$.ajax({
		type: "POST",
		url: "http://localhost:8080/yijiu/user/addUser.do",
		data:{username:username},
		dataType: "json",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
		success: function(data) {
			alert("发送成功")
		},
		error: function(data) {
			alert("发送失败")
		}
	});
}
