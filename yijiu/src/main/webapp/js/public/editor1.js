 var toolbar = [ 'title','bold','italic','underline','fontScale','color','|','blockquote','code','table','|','link','image','hr','|','indent','outdent','alignment']; 
				var editor = new Simditor({
					  textarea: $('#editor'),
					  placeholder: '写出你的想法',
					  defaultImage:"/images/image.png",
					  toolbar:toolbar,
					  upload: {
						      url:"/images/image.png",
						      params: null,
						      fileKey: 'upload_file',
						      connectionCount: 5,
						      leaveConfirm: 'Uploading is in progress, are you sure to leave this page?',
						    	  },
				      pasteImage:true,
					});
