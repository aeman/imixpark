define(function(require, exports, module) {
	//找店页面公用js
	module.exports={
		DRC_SELECT:Event_select
	}
	var const_ul;
    $(function(){
    	//入口
    	
    	var doc = $("body");
    		const_ul = $("#DRC-List-source"),
    		const_li = $("#DRC-List-source-in");
    		doc.on("touchstart",".J_Event_Select,.J_Event_SELECT_LI",function(){
    			var th = $(this);
    			if(th.hasClass("J_Event_Select")){ 
    				var pa = th.siblings();
    					const_ul.html("");
    					if(!th.hasClass("active")){
    						th.addClass("active");
    						Event_Mousedown(th.attr("id"),th);
    					}else{

    						th.removeClass("active");
    					}

    			}
    			if(th.hasClass("J_Event_SELECT_LI")){ 
    				Event_Mousedown_ul_li(th)
    			 }

    		})

    })
 	//公共函数
 	function Event_select(arg){

       var opt = {
       	   id:"floor",
       	   data:[{txt:"查询为空",id:0,src:"#"}]
			};
			
		    _.extend(opt,arg);

		    if(!opt["id"]&&!document.querySelector(opt["id"])){alert("页面中没有对应的id"); return;}
			$.data(document.getElementById(opt["id"]),opt["id"],opt["data"]);
			return this;
 	}
 	//mousendown调用
 	function Event_Mousedown(id,th){
 	    
 		var str = "<li data-id='<%=id%>' class='J_Event_SELECT_LI' href='<%=src%>'><%=txt%></li>",
 			txt="",
 			pa = th.parent(),
 			data = $.data(document.getElementById(id),id);
 			ul = const_ul;
 			ul.html("");
 			data.map(function(ele,ind){

 				var _obj = {};

 				for(var i in ele){
 					_obj[i] = ele[i];
 				}
 				//if(_obj["Class"]){ _obj["Class"]=""} }
 				txt+=_.template(str)(_obj);
 				
 			});
 			ul.append(txt);
 	}
 	/**
 	 * [点击li标签]
 	 */
 	function Event_Mousedown_ul_li(th){
 		var sbli = th.siblings();
 			sbli.removeClass("active");
 			Event_callback(th);
 	}
 	function Event_callback(th){
 		if(!th.hasClass("active")){
 			th.addClass("active");
 			var src = th.attr("href");
 			if(src){
 				
 			}
 		}
 	}

});