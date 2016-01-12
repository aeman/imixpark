define(function(require, exports, module) {
	//找店页面公用js
  	var req = require("../js/bower_components/iscroll/build/iscroll.js");
  	var req2 = require.async("../js/default.js");//引入弹出
	module.exports={
		DRC_scrollBar:scrollBar
	}
    var doc = $(document);
	function scrollBar(){
        var myScroll;
		$(function(){

			var 
				box = $(".DRC-sheetSnap-scrollBox"),
				ul = box.find("ul"),
				li = ul.find("li"),
				w = li.length * 150;
				ul.css("width",w+10+"px");
				myScroll = new IScroll('#wrapper', {
				scrollX: true,
				scrollY: true,
				momentum: false,
				snap: true
	});

			doc.on("touchend",".J_showBox",function(){
				var th = $(this);
				if(th.hasClass("J_showBox")){ Event_touchend(th) }
			})

		})//end	


	}

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