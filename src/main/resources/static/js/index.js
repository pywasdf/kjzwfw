/***********************顶部导航点击选中样式*****************************/
$(document).ready(function(){
	$("#nav1 li").click(function(){
		$(this).addClass("nav1li").siblings().removeClass("nav1li");
	});
});
/***********************左侧导航点击选中事件*****************************/
$(document).ready(function(){
	$(".nav2 li").click(function(){
		$(this).addClass("nav2li").siblings().removeClass("nav2li");
	});
});
/***********************导航3点击选中事件*****************************/
$(document).ready(function(){
	$(".nav3 span").click(function(){//鼠标单击时
		$(this).addClass("nav3_li").siblings().removeClass("nav3_li");//改变class
	});
	$(".nav32 span").click(function(){//鼠标单机时
		$(this).addClass("nav3_li2").siblings().removeClass("nav3_li2");//改变class
	});
	$(".nav4>li").click(function(){//鼠标单机时
		$(this).addClass("nav4_li").siblings().removeClass("nav4_li");//改变class
	});
	$(".tztg").click(function(){//鼠标单机时
		if($(".tztg_content").css("display") == "none"){
			$(".tztg_content").css("display","block");
			$(".bzgf_content").css("display","none");
		}
	});
	$(".bzgf").click(function(){//鼠标单机时
		if($(".bzgf_content").css("display") == "none"){
			$(".bzgf_content").css("display","block");
			$(".tztg_content").css("display","none");
		}
	});
});
/*********************检索条件展开收起,更多按钮点击事件*******************************/
$(document).ready(function() {
	$("#button1").click(function() {
		$("#searchbox3").toggle();
		if($("#searchbox3").css("opacity") == 0){
			$("#searchbox3").css("opacity","1");
		}
		else{
			$("#searchbox3").css("opacity","0");
		}
	});

	$("#button1").click(function() {
	    if ($("#button1").val() == "更多") {
			this.value="收起";
		}
		else {
	        this.value = "更多";
		}
	});
});
/*********************检索条件重置按钮******************/
$(document).ready(function() {
	$("#button2").click(function(){
		$(".inptext").val("");
	});
});
/**********************无数据弹框*************************/
$(document).ready(function(){
	$("#button3").click(function(){
		$(".nodatabox").toggle();
		$(".tablebox td").toggle();
		$(".paging").toggle();
	});
});
/*************************table点击事件********************************/
$(document).ready(function(){
	$("#search3 span").click(function(){
		$(this).addClass("search3-titlea").siblings().removeClass("search3-titlea");
	});
});
/*************************分页器点击事件********************************/
$(document).ready(function(){
	$("#paging a").click(function(){
		$(this).addClass("fenyeqi").siblings().removeClass("fenyeqi");
	});
});
/**************分页器input输入限制***********************/
$(document).ready(function() {
	$("#pagingtz").keyup(function() {
		if($("#pagingtz").val()>=9999){
			this.value = "";
		}
		else{
			this;
		}
	});
});
/*********************弹窗事件*******************************/
$(document).ready(function() {
	$(".tdspan3").click(function() {//弹出弹框
		$("#tcbox1").toggle();
	});
	$(".tcClose").click(function() {//关闭弹框
		$("#tcbox1").toggle();
	});
});
/***********年度专项***********/
$(document).ready(function() {
	$(".ndzx").click(function() {//弹出弹框
		$(".tc3_ndzx").css("right","0px");
	});
	$(".ndzx_list a").click(function() {//关闭弹框
		$(".tc3_ndzx").css("right","-240px");
		$(".nd1").toggle();
		$(".nd2").toggle();
	});
});

$(document).ready(function () {  
	$(".tdspan").click(function() {//弹出弹框
		$("#tcbox2").toggle();
	});
	$(".tcClose2").click(function() {//关闭弹框
		$("#tcbox2").toggle();
	});
	$(".tcndzx").click(function() {//关闭弹框
		$("#ndp1").toggle();
		$(".nd").toggle();
	});
	$("#jianrong").click(function(){//浏览器兼容弹窗打开
		$("#tcbox4").toggle();
	});
	$("#endimg").click(function(){//浏览器兼容弹框关闭
		$("#tcbox4").toggle();
	});
	$(".dcqd").click(function () {//弹窗导出清单打开
	    $("#tcboxqd").toggle();
	});
	$(".tcClose5").click(function () {//弹窗导出清单关闭
	    $("#tcboxqd").toggle();
	});
	$(".dcdwry").click(function () {//弹窗导出单位人员打开
	    $("#tcboxdwry").toggle();
	});
	$(".tcClose6").click(function () {//弹窗导出单位人员关闭
	    $("#tcboxdwry").toggle();
	});
	$(".dcccjg").click(function () {//查重结果打开
	    $("#tcboxccjg").toggle();
	});
	$(".tcClose7").click(function () {//查重结果关闭
	    $("#tcboxccjg").toggle();
	});	
	$(".tcClose8").click(function () {//单条退回
	    $("#tcboxdtth").toggle();
	});
	$(".tcClose9").click(function () {//暂停启动
	    $("#tcboxztqd").toggle();
	});
});
/***********************login浏览器兼容弹窗*****************************/
$(document).ready(function(){
	$(".tcon").click(function(){
		$(".lgtcbox").toggle();
	});
	$("#endimg").click(function(){
		$(".lgtcbox").toggle();
	});
});

/************************全选和取消全选点击事件*************************/
$(document).on('click','#qxwhole',function(){//全选
	if(!$(this).is(":checked")){
		$('.dxk').prop('checked',true);
	}
	else{
		$('.dxk').prop('checked',false);
	}
});
$(document).on('click','#qxwhole2',function(){//取消全选
	if($(this).is(":checked")){
		$('.dxk').prop('checked',true);
	}
	else{
		$('.dxk').prop('checked',false);
	}
});
/***********全选和取消按钮隐藏显示************/
$(document).ready(function() {
	$("#qxwhole").click(function(){//全选按钮隐藏，显示取消按钮
		$("#qxwhole").toggle();
		$("#qxwhole2").toggle();
	});
	$("#qxwhole2").click(function(){//取消按钮隐藏。显示全选按钮
		$("#qxwhole2").toggle();
		$("#qxwhole").toggle();
	});
});
//******************************年月日时间********************************
$(document).ready(setInterval("time.innerHTML=new Date().toLocaleString()",1000));
//*******************************************************












