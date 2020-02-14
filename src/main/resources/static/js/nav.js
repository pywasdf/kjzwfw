
// JavaScript Document
$(function () {
    // nav收缩展开
    $('#aat').on('click','.nav-item>a',function(){
        if (!$('.nav').hasClass('nav-mini')) {
            if ($(this).next().css('display') == "none") {
                //展开未展开
                $('.nav-item').children('ul').slideUp(200);
                $(this).next('ul').slideDown(200);
                $(this).parent('li').addClass('nav-show').siblings().removeClass('nav-show');
            }else{
                //收缩已展开
                $(this).next('ul').slideUp(200);
                $('.nav-item.nav-show').removeClass('nav-show');
            }
        }
        document.getElementById("li01").style.backgroundColor = "#139188";
        document.getElementById("li01").style.borderColor = "#139188";
        document.getElementById("li01").style.color = "#ffffff";
        document.getElementById("li02").style.backgroundColor = "#139188";
        document.getElementById("li02").style.borderColor = "#139188";
        document.getElementById("li02").style.color = "#ffffff";
        document.getElementById("li03").style.backgroundColor = "#139188";
        document.getElementById("li03").style.borderColor = "#139188";
        document.getElementById("li03").style.color = "#ffffff";
        document.getElementById("li04").style.backgroundColor = "#139188";
        document.getElementById("li04").style.borderColor = "#139188";
        document.getElementById("li04").style.color = "#ffffff";
        document.getElementById("li05").style.backgroundColor = "#139188";
        document.getElementById("li05").style.borderColor = "#139188";
        document.getElementById("li05").style.color = "#ffffff";
    });
    // 标志点击样式
    $('#aat').on('click','.nav-item>ul>li',function(){
		$('.nav-item>ul>li').css('background','none');
		$('.nav-item>ul>li>a').css('background','#ffffff');
		$('.nav-item>ul>li>a').css('color', '#666666');
		$('.nav-item>ul>li>a').css('border-color', '#cccccc');
		$(this).children('li>a').css('background', '#139188');
		$(this).children('li>a').css('color', '#ffffff');
		$(this).children('li>a').css('border-color', '#139188');
    });
    $(".nav-item").click(function () {
        $('.nav-item>ul>li>a').css('background', '#ffffff');
        $('.nav-item>ul>li>a').css('color', '#666666');
        $('.nav-item>ul>li>a').css('border-color', '#dddddd');
        $(this).siblings().css({"background":"#ffffff","color":"#139188"});
    });
    
	//nav-mini切换
    $('#mini').on('click',function(){
        if (!$('.nav').hasClass('nav-mini')) {
            $('.nav-item.nav-show').removeClass('nav-show');
            $('.nav-item').children('ul').removeAttr('style');
            $('.nav').addClass('nav-mini');
        }else{
            $('.nav').removeClass('nav-mini');
        }
    });
});




















