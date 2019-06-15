/**alert.js 封装对话框处理**/
//弹出创建笔记本对话框
function alertAddBookWindow(){
//		alert("---");
        $("#can").load("alert/alert_notebook.html");
        $(".opacity_bg").show();
	}

//关闭对话框
function closeAlertWindow(){
	$("#can").empty();//清空对话框内容
	$(".opacity_bg").hide();//隐藏背景div
}

//弹出重命名笔记本对话框
function alertRenameBookWindow(){
	$("#can").load(
		"alert/alert_rename.html");
	$(".opacity_bg").show();
};

//弹出创建笔记对话框
function alertAddNoteWindow(){
	//如果没有选中的笔记本提示
	var $a = $("#book_ul a.checked");
	if($a.length==0){
		alert("请选择笔记本");
	}else{//有选择的笔记本
		$("#can").load("alert/alert_note.html");
	$(".opacity_bg").show();
	}
	
};

//弹出删除笔记确认对话框
function alertDeleteNoteWindow(){
	$("#can").load("alert/alert_delete_note.html");
	$(".opacity_bg").show();
}

//弹出转移笔记对话框
function alertMoveNoteWindow(){
	$("#can").load("alert/alert_move.html",function(){
		$(".opacity_bg").show();
		//为alert_move.html中<select>加载数据
		var books = $("#book_ul li");//获取book列表
		//循环book列表数据
		for(var i=0;i<books.length;i++){
			var $li = $(books[i]);//获取li元素并转为jQuery对象
			var bookId = $li.data("bookId");//获取笔记本id
			var bookName = $li.text().trim();//获取笔记本名
			//创建一个option元素
			var sopt = '';
			sopt+='<option value="'+bookId+'">';
			sopt+= bookName;
			sopt+='</option>';
			//添加到select中
			$("#moveSelect").append(sopt);
		}
	});
	
}
