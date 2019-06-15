/**book.js封装笔记本相关处理**/
function loadUserBooks(){
	//1.加载用户笔记本列表
	//获取请求参数
	var userId = getCookie("uid");
    //检查格式
    if(userId==null){
    	window.location.href="log_in.html";
    }else{
    	//发送Ajax请求
    	$.ajax({
    		url:"/book/loadbooks.do",
			 type:"post",
			 data:{"userId":userId},
			 dataType:"json",
			 success:function(result){
				 if(result.status==0){
					 //获取返回的笔记本集合
					 var books = result.data;
					 //循环生成列表元素
					 for(var i=0;i<books.length;i++){
						 var bookId = books[i].cn_notebook_id;//获取笔记本ID
		   				 var bookName = books[i].cn_notebook_name;//获取笔记本名称
		   				//创建笔记本列表li
		   				createBookLi(bookId,bookName);
					 }
				 }
			 },
			 error:function(){
				 alert("加载笔记列表异常");
			 }
    	});
    }
}

//确写创建笔记本
function addBook(){
	 //获取请求参数
	 var name = $("#input_notebook").val().trim();
	 var userId = getCookie("uid");
	 //格式检查
	 var ok = true;
	 if(name==""){
		 ok = false;
		 $("#notebook_span").html("笔记本名为空");
	 }
	 if(userId==null){
		 ok = false;
		 window.location.href="log_in.html";
	 }
	 //发送Ajax请求
	 if(ok){
		$.ajax({
			url:"/book/add.do",
			 type:"post",
			 data:{"userId":userId,"name":name},
			 dataType:"json",
			 success:function(result){
				 if(result.status==0){
				//关闭对话框
				 closeAlertWindow();
				 //生成笔记本li元素
				 var bookId = result.data.cn_notebook_id;
				 var bookName = result.data.cn_notebook_name;
				 createBookLi(bookId,bookName);
				 //提示成功
				 alert(result.msg);
				 }
			 },
			 error:function(){
				 alert("创建笔记本异常");
			 }
		}); 
	 }
}

//创建笔记本列表li元素
function createBookLi(bookId,bookName){
	    //构建列表li元素
		var sli = "";
		sli+='<li class="online">';
		sli+='  <a >';
		sli+='    <i class="fa fa-book" title="online" rel="tooltip-bottom">';
		sli+='    </i>'+bookName;
		sli+='  </a>';
		sli+='</li>';
	    //将bookId绑定到li元素上
		var $li = $(sli);//将字符串转成jquery对象
		$li.data("bookId",bookId);
	    //将li元素添加到ul列表中
		$("#book_ul").append($li);
}