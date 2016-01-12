define(function(require, exports, module) {
	//找店页面公用js

	module.exports={
		//DRC_SELECT:Event_select
	}

    $(function(){
    	var doc = $(document);
    	doc.on("touchend",".J_showBox",function(){
				var th = $(this);
				if(th.hasClass("J_showBox")){ Event_touchend(th) }
			})

    })

    //公共函数
	function Event_touchend(th){
		if(!iss){return}
         iss.dialog({
         	title:"提示",
         	content:"更多内容请下载APP.",
         	width:"400px",
         	height:"250px",
         	okVal:"下载APP",
         	cancelVal:"取消"
         })
	}



})