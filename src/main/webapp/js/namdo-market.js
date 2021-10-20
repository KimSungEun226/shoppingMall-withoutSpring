/**
	js에서 contextPath 구하는 함수
 */
function getContextPath(){
	var hostIndex = location.href.indexOf(location.host) + location.host.length;
	var path = location.href.substring(hostIndex, location.href.indexOf('/', hostIndex + 1));
	return path;
}

var contextPath = getContextPath();

/**
	지역에 따른 카테고리 선택하는 함수
 */
function regionSelect(regionNo){
    location.href = contextPath + "/front?key=item&methodName=selectByRegionNo&regionNo=" + regionNo;
}

/**
	regionNo와 categoryNo에 따라 카테고리 선택하는 함수
 */
function categoryOfRegionSelect(regionNo, categoryNo){
	location.href = contextPath + "/front?key=item&methodName=selectByCategoryOfRegion&regionNo=" + regionNo + "&categoryNo=" + categoryNo;
}

/**
	categoryNo에 따라 카테고리 선택하는 함수
 */
function categorySelect(categoryNo){
	location.href = contextPath + "/front?key=item&methodName=selectByCategoryNo&categoryNo=" + categoryNo;
}

/**
	종류 선택하는 라디오 버튼 눌렀을 때 출력되는 함수()
 */
function inputSelect(inputNo){
	
	var name = "";
	if(inputNo == 1) name = "굴비";
	else if(inputNo == 2) name = "낙지";
	else if(inputNo == 3) name = "홍어";
	else if(inputNo == 4) name = "장어"
	else if(inputNo == 5) name = "멸치"
	else if(inputNo == 6) name = "황태채"
	else if(inputNo == 7) name = "김"
	else if(inputNo == 8) name = "미역"
	else if(inputNo == 9) name = "전복"
	else if(inputNo == 10) name = "바지락"
	else if(inputNo == 11) name = "꼬막"
	else if(inputNo == 12) name = "새우"
	
	location.href = contextPath + "/front?key=item&methodName=selectByInputItemName&input=" + name;
}



/**
	categoryNo을 이름으로 바꾸는 함수
 */
$(function(){
	$("a[id='1']").text("생선");
	$("a[id='2']").text("건어물");
	$("a[id='3']").text("김/해초류");
	$("a[id='4']").text("해산물/어패류");
	$("a[id='5']").text("젓갈");
	$("a[id='6']").text("수산물 기타");
});