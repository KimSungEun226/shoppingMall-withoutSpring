<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Title -->
    <title>E-commerce Signup Page | Unify - Responsive Website Template</title>

    <!-- Required Meta Tags Always Come First -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">

    <!-- Favicon -->
    <link rel="shortcut icon" href="../favicon.ico">

    <!-- Google Fonts -->
    <link rel="stylesheet" href="//fonts.googleapis.com/css?family=Roboto:300,400,500,700,900">

    <!-- CSS Global Compulsory -->
    <link rel="stylesheet" href="../assets/vendor/bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="../assets/vendor/icon-line/css/simple-line-icons.css">

    <!-- CSS Implementing Plugins -->
    <link rel="stylesheet" href="../assets/vendor/icon-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="../assets/vendor/icon-line-pro/style.css">
    <link rel="stylesheet" href="../assets/vendor/jquery-ui/themes/base/jquery-ui.min.css">
    <link rel="stylesheet" href="../assets/vendor/chosen/chosen.css">
    <link rel="stylesheet" href="../assets/vendor/icon-hs/style.css">
    <link rel="stylesheet" href="../assets/vendor/animate.css">
    <link rel="stylesheet" href="../assets/vendor/hamburgers/hamburgers.min.css">
    <link rel="stylesheet" href="../assets/vendor/hs-megamenu/src/hs.megamenu.css">
    <link rel="stylesheet" href="../assets/vendor/malihu-scrollbar/jquery.mCustomScrollbar.min.css">

    <!-- CSS Unify Theme -->
    <link rel="stylesheet" href="assets/css/styles.e-commerce.css">

    <!-- CSS Customization -->
    <link rel="stylesheet" href="../assets/css/custom.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript">
    
    
    //유효성체크
    function form_check() {
    	  //변수에 담아주기
    	  var sellerName = document.getElementById("sellerName");
    	  var sellerId = document.getElementById("sellerId");
    	  var sellerAddr = document.getElementById("sellerAddr");
    	  var sellerDetailAddr = document.getElementById("sellerDetailAddr");

    	  var idDupleCheck = document.getElementById("dupleCheck");
    	  var emailDupleCheck = document.getElementById("dupleCheck2");
    	  var contactDupleCheck = document.getElementById("dupleCheck3");
    	  var businessDupleCheck = document.getElementById("dupleCheck4");
    	  var sellerEmail = document.getElementById("sellerEmail");
    	  var sellerContact = document.getElementById("sellerContact");
    	  var sellerBusinessNo = document.getElementById("sellerBusinessNo");
    	  var sellerPwd = document.getElementById("sellerPwd");
    	  var sellerPwdCheck = document.getElementById("sellerPwdCheck");
    	  var reg_name = /^[가-힣]+$/; //한글만
    	  var reg_num = /^[0-9]*$/; // 숫자만 
    	  var reg_pwd = /^[a-z0-9_-]{6,18}$/; // 단순 6~18자리
    	  
          
    	  if (sellerName.value == "" || !reg_name.test(sellerName.value) || sellerName.value.length >5 ) { //해당 입력값이 없을 경우 같은말: if(!uid.value)
    	    alert("이름을 확인하세요.");
    	    sellerName.focus(); //focus(): 커서가 깜빡이는 현상, blur(): 커서가 사라지는 현상
    	    return false; //return: 반환하다 return false:  아무것도 반환하지 말아라 아래 코드부터 아무것도 진행하지 말것
    	  };
	  
      	  
    	  if (sellerId.value == "") { //해당 입력값이 없을 경우 같은말: if(!uid.value)
      	    alert("아이디를 확인하세요.");
      	    sellerId.focus(); //focus(): 커서가 깜빡이는 현상, blur(): 커서가 사라지는 현상
      	    return false; //return: 반환하다 return false:  아무것도 반환하지 말아라 아래 코드부터 아무것도 진행하지 말것
      	  };
      	  
      	  if (idDupleCheck.innerText == "사용불가능") { //해당 입력값이 없을 경우 같은말: if(!uid.value)
      	    alert("아이디를 확인해주세요.");
      	    sellerId.focus(); //focus(): 커서가 깜빡이는 현상, blur(): 커서가 사라지는 현상
      	    return false; //return: 반환하다 return false:  아무것도 반환하지 말아라 아래 코드부터 아무것도 진행하지 말것
      	  };

      	  if (sellerAddr.value == "") { //해당 입력값이 없을 경우 같은말: if(!uid.value)
        	    alert("주소를 입력하세요.");
        	    return false; //return: 반환하다 return false:  아무것도 반환하지 말아라 아래 코드부터 아무것도 진행하지 말것
          };
          
          if (sellerDetailAddr.value == "") { //해당 입력값이 없을 경우 같은말: if(!uid.value)
      	    alert("상세주소를 입력하세요.");
      	    return false; //return: 반환하다 return false:  아무것도 반환하지 말아라 아래 코드부터 아무것도 진행하지 말것
      	  };

      	  
      	  if (sellerEmail.value == "" ) { //해당 입력값이 없을 경우 같은말: if(!uid.value)
      	    alert("이메일을 입력하세요.");
      	    sellerEmail.focus(); //focus(): 커서가 깜빡이는 현상, blur(): 커서가 사라지는 현상
      	    return false; //return: 반환하다 return false:  아무것도 반환하지 말아라 아래 코드부터 아무것도 진행하지 말것
      	  };
      	  
      	  if (emailDupleCheck.innerText == "사용불가능") { //해당 입력값이 없을 경우 같은말: if(!uid.value)
        	    alert("이메일을 확인하세요.");
        	    sellerEmail.focus(); //focus(): 커서가 깜빡이는 현상, blur(): 커서가 사라지는 현상
        	    return false; //return: 반환하다 return false:  아무것도 반환하지 말아라 아래 코드부터 아무것도 진행하지 말것
        	  };      	  
      	  
      	  if (sellerContact.value == "" ) { //해당 입력값이 없을 경우 같은말: if(!uid.value)
      	    alert("전화번호를 확인하세요.");
      	    sellerContact.focus(); //focus(): 커서가 깜빡이는 현상, blur(): 커서가 사라지는 현상
      	    return false; //return: 반환하다 return false:  아무것도 반환하지 말아라 아래 코드부터 아무것도 진행하지 말것
      	  };
      	  
      	  if (contactDupleCheck.innerText == "사용불가능") { //해당 입력값이 없을 경우 같은말: if(!uid.value)
        	    alert("연락처를 확인하세요.");
        	    sellerContact.focus(); //focus(): 커서가 깜빡이는 현상, blur(): 커서가 사라지는 현상
        	    return false; //return: 반환하다 return false:  아무것도 반환하지 말아라 아래 코드부터 아무것도 진행하지 말것
           };
        	  
    	   if (sellerBusinessNo.value == "") { //해당 입력값이 없을 경우 같은말: if(!uid.value)
        	    alert("사업자 번호를 확인하세요.");
        	    sellerBusinessNo.focus(); //focus(): 커서가 깜빡이는 현상, blur(): 커서가 사라지는 현상
        	    return false; //return: 반환하다 return false:  아무것도 반환하지 말아라 아래 코드부터 아무것도 진행하지 말것
        	  };   
        	  
          if (businessDupleCheck.innerText == "사용불가능") { //해당 입력값이 없을 경우 같은말: if(!uid.value)
          	    alert("사업자번호를 확인하세요.");
          	    sellerBusinessNo.focus(); //focus(): 커서가 깜빡이는 현상, blur(): 커서가 사라지는 현상
          	    return false; //return: 반환하다 return false:  아무것도 반환하지 말아라 아래 코드부터 아무것도 진행하지 말것
           };
      	  
      	   if (sellerPwd.value == "" || !reg_pwd.test(sellerPwd.value)) { //해당 입력값이 없을 경우 같은말: if(!uid.value)
      	    alert("비밀번호를 확인하세요.");
      	    sellerPwd.focus(); //focus(): 커서가 깜빡이는 현상, blur(): 커서가 사라지는 현상
      	    return false; //return: 반환하다 return false:  아무것도 반환하지 말아라 아래 코드부터 아무것도 진행하지 말것
      	  };
      	  
      	   if (sellerPwdCheck.value == "" || !reg_pwd.test(sellerPwdCheck.value)) { //해당 입력값이 없을 경우 같은말: if(!uid.value)
      	    alert("비밀번호(확인)를 확인하세요.");
      	    sellerPwdCheck.focus(); //focus(): 커서가 깜빡이는 현상, blur(): 커서가 사라지는 현상
      	    return false; //return: 반환하다 return false:  아무것도 반환하지 말아라 아래 코드부터 아무것도 진행하지 말것
      	  };
      	  
      	  if(sellerPwd.value != sellerPwdCheck.value) {
      		  alert("비밀번호가 일치하지 않습니다.")
      		  sellerPwdCheck.value = "";
      		  sellerPwdCheck.focus();
      		  return false;
      	  }
      	  
    	  

    	  //입력 값 전송
    	  document.signUp_form.submit(); //유효성 검사의 포인트 
    	  
    	}

    
    
    $(function(){
    	$("#sellerId").keyup(function(){
  		  
  		  if($(this).val()=="") {
  			  $("#dupleCheck").html("");
  			  return;  //함수를 빠져나가라.
  		  }
  		  
  		  $.ajax({
    		  url: "../../idCheck",         //서버요청주소
    		   type: "post",                        //method방식(get,post,put,delete)
    		   dataType: "text",                    //서버가 응답해주는 데이터의 type(text, html, xml, json)
    		   data:{id:$(this).val(), info:"seller"} ,       //서버에게 보낼 parameter정보
    		   
    		   success: function(result){    //개수|단어,단어,단어,단어...
    		       //alert(result);
    		       //console.log("result : " + result);
    		       $("#dupleCheck").html(result);
    		       
    		   },//성공했을때 callback함수      
    		    //실패했을때 함수
    		   error: function(err){
    			   alert(err+"발생했어요")
    		   }
    		   
    	   });//ajax끝
  	  });
    	
    	$("#sellerEmail").keyup(function(){
    		  
    		  if($(this).val()=="") {
    			  $("#dupleCheck2").html("");
    			  return;  //함수를 빠져나가라.
    		  }
    		  
    		  $.ajax({
      		  url: "../../emailCheck",         //서버요청주소
      		   type: "post",                        //method방식(get,post,put,delete)
      		   dataType: "text",                    //서버가 응답해주는 데이터의 type(text, html, xml, json)
      		   data:{email:$(this).val(), info:"seller"} ,       //서버에게 보낼 parameter정보
      		   
      		   success: function(result){    //개수|단어,단어,단어,단어...
      		       //alert(result);
      		       //console.log("result : " + result);
      		       $("#dupleCheck2").html(result);
      		       
      		   },//성공했을때 callback함수      
      		    //실패했을때 함수
      		   error: function(err){
      			   alert(err+"발생했어요")
      		   }
      		   
      	   });//ajax끝
    	  });
    	
    	$("#sellerContact").keyup(function(){
    		  
    		  if($(this).val()=="") {
    			  $("#dupleCheck3").html("");
    			  return;  //함수를 빠져나가라.
    		  }
    		  
    		  $.ajax({
      		  url: "../../contactCheck",         //서버요청주소
      		   type: "post",                        //method방식(get,post,put,delete)
      		   dataType: "text",                    //서버가 응답해주는 데이터의 type(text, html, xml, json)
      		   data:{contact:$(this).val(), info:"seller"} ,       //서버에게 보낼 parameter정보
      		   
      		   success: function(result){    //개수|단어,단어,단어,단어...
      		       //alert(result);
      		       //console.log("result : " + result);
      		       $("#dupleCheck3").html(result);
      		       
      		   },//성공했을때 callback함수      
      		    //실패했을때 함수
      		   error: function(err){
      			   alert(err+"발생했어요")
      		   }
      		   
      	   });//ajax끝
    	  });

    	$("#sellerBusinessNo").keyup(function(){
  		  
  		  if($(this).val()=="") {
  			  $("#dupleCheck4").html("");
  			  return;  //함수를 빠져나가라.
  		  }
  		  
  		  $.ajax({
    		  url: "../../businessNoCheck",         //서버요청주소
    		   type: "post",                        //method방식(get,post,put,delete)
    		   dataType: "text",                    //서버가 응답해주는 데이터의 type(text, html, xml, json)
    		   data:{businessNo:$(this).val()} ,       //서버에게 보낼 parameter정보
    		   
    		   success: function(result){    //개수|단어,단어,단어,단어...
    		       //alert(result);
    		       //console.log("result : " + result);
    		       $("#dupleCheck4").html(result);
    		       
    		   },//성공했을때 callback함수      
    		    //실패했을때 함수
    		   error: function(err){
    			   alert(err+"발생했어요")
    		   }
    		   
    	   });//ajax끝
  	  });    	
    	
    })
    
    </script>
  </head>

  <body>
    <main>
      <!-- Header -->
      <c:if test="${sessionScope.customerDTO==null && sessionScope.sellerDTO==null}">
        <jsp:include page="common/header.jsp"/>
      </c:if>

      <c:if test="${sessionScope.customerDTO!=null}">
        <jsp:include page="common/customer-header.jsp"/>
      </c:if>

      <c:if test="${sessionScope.sellerDTO!=null}">
        <jsp:include page="common/seller-header.jsp"/>
      </c:if>

      <!-- Breadcrumbs -->
      <section class="g-brd-bottom g-brd-gray-light-v4 g-py-30">
        <div class="container">
          <ul class="u-list-inline">
            <li class="list-inline-item g-mr-5">
              <a class="u-link-v5 g-color-text" href="#">Home</a>
              <i class="g-color-gray-light-v2 g-ml-5 fa fa-angle-right"></i>
            </li>
            <li class="list-inline-item g-mr-5">
              <a class="u-link-v5 g-color-text" href="#">Pages</a>
              <i class="g-color-gray-light-v2 g-ml-5 fa fa-angle-right"></i>
            </li>
            <li class="list-inline-item g-color-primary">
              <span>Signup</span>
            </li>
          </ul>
        </div>
      </section>
      <!-- End Breadcrumbs -->

      <!-- Signup -->
      <section class="container g-pt-100 g-pb-20">
        <div class="row justify-content-center">
          <div class="col-lg-5 order-lg-2 g-mb-80">
            <div class="g-brd-around g-brd-gray-light-v3 g-bg-white rounded g-px-30 g-py-50 mb-4">
              <header class="text-center mb-4">
                <h1 class="h4 g-color-black g-font-weight-400">판매자 회원가입</h1>
              </header>

              <!-- Form -->
              <form name="signUp_form" class="g-py-15" action="${pageContext.request.contextPath}/front">
			      <input type="hidden" name="key" value = "seller" /> <!-- Controller를 찾는 정보 -->
			      <input type="hidden" name="methodName" value = "signUp" />  <!-- 메소드이름 -->
                <div class="row">
                  <div class="col g-mb-20">
                    <input id="sellerName" name="sellerName" class="form-control g-color-black g-bg-white g-bg-white--focus g-brd-gray-light-v3 rounded g-py-15 g-px-15" type="text" placeholder="이름">
                  </div>
                </div>


                <div class="row">
                  <div class="col-sm-8 col-md-12 col-lg-8 g-mb-20">
                    <input id="sellerId" name="sellerId" class="form-control g-color-black g-bg-white g-bg-white--focus g-brd-gray-light-v3 rounded g-py-15 g-px-15" type="text" placeholder="아이디">
                  </div>
                  
                  <div id="dupleCheck"  class="g-mb-20 g-py-15 g-px-5">
                    
                  </div>   
                </div>
                
				<div class="g-mb-20">
                  <input id="sellerZip" name="sellerZip" class="form-control g-color-black g-bg-white g-bg-white--focus g-brd-gray-light-v3 rounded g-py-15 g-px-15" type="text" placeholder="주소" onclick="findAddr()">
                </div>
                <div class="g-mb-20">
                  <input id="sellerAddr" name="sellerAddr" class="form-control g-color-black g-bg-white g-bg-white--focus g-brd-gray-light-v3 rounded g-py-15 g-px-15" type="text">
                </div>
                
                <div class="g-mb-20">
                  <input id="sellerDetailAddr" name="sellerDetailAddr" class="form-control g-color-black g-bg-white g-bg-white--focus g-brd-gray-light-v3 rounded g-py-15 g-px-15" type="text" placeholder="상세주소">
                </div>
                
                
                
               <div class="row">
                  <div class="col-sm-7 col-md-10 col-lg-7 g-mb-20">
                    <input id="sellerEmail" name="sellerEmail" class="form-control g-color-black g-bg-white g-bg-white--focus g-brd-gray-light-v3 rounded g-py-15 g-px-15" type="email" placeholder="이메일">
                  </div>
                  
                  <div id="dupleCheck2"  class="g-mb-20 g-py-15 g-px-5">
                    
                  </div>   
                </div>

               <div class="row">
                  <div class="col-sm-8 col-md-10 col-lg-8 g-mb-20">
                    <input id="sellerContact" name="sellerContact" class="form-control g-color-black g-bg-white g-bg-white--focus g-brd-gray-light-v3 rounded g-py-15 g-px-15" type="text" placeholder="전화번호(010-0000-0000)">
                  </div>
                  
                  <div id="dupleCheck3"  class="g-mb-20 g-py-15 g-px-5">
                    
                  </div>   
                </div>
                
               <div class="row">
                  <div class="col-sm-8 col-md-8 col-lg-8 g-mb-20">
                    <input input id="sellerBusinessNo" name="sellerBusinessNo" class="form-control g-color-black g-bg-white g-bg-white--focus g-brd-gray-light-v3 rounded g-py-15 g-px-15" type="text" placeholder="사업자등록번호(숫자10자리)">
                  </div>
                  
                  <div id="dupleCheck4"  class="g-mb-20 g-py-15 g-px-5">
                    
                  </div>   
                </div>
                
                <div class="g-mb-20">
                  <input id="sellerPwd" name="sellerPwd" class="form-control g-color-black g-bg-white g-bg-white--focus g-brd-gray-light-v3 rounded g-py-15 g-px-15" type="password" placeholder="비밀번호(6~18자리)">
                </div>

                <div class="g-mb-20">
                  <input id="sellerPwdCheck"  class="form-control g-color-black g-bg-white g-bg-white--focus g-brd-gray-light-v3 rounded g-py-15 g-px-15" type="password" placeholder="비밀번호확인">
                </div>
                
                

                <button class="btn btn-block u-btn-primary g-font-size-12 text-uppercase g-py-12 g-px-25" type="button" onclick="form_check()">회원 등록</button>
              </form>
              <!-- End Form -->
            </div>

            <div class="text-center">
              <p class="g-color-gray-dark-v5 mb-0">이미 등록된 계정이 존재하신가요?
                <a class="g-font-weight-600" href="page-login-seller.jsp">로그인</a></p>
            </div>
          </div>


        </div>
      </section>
      <!-- End Signup -->

	  <!-- Footer -->
	  <jsp:include page="common/footer.jsp"/>

      <a class="js-go-to u-go-to-v2" href="#"
         data-type="fixed"
         data-position='{
           "bottom": 15,
           "right": 15
         }'
         data-offset-top="400"
         data-compensation="#js-header"
         data-show-effect="zoomIn">
        <i class="hs-icon hs-icon-arrow-top"></i>
      </a>
    </main>

    <div class="u-outer-spaces-helper"></div>

    <!-- JS Global Compulsory -->
    <script src="../assets/vendor/jquery/jquery.min.js"></script>
    <script src="../assets/vendor/jquery-migrate/jquery-migrate.min.js"></script>
    <script src="../assets/vendor/popper.js/popper.min.js"></script>
    <script src="../assets/vendor/bootstrap/bootstrap.min.js"></script>

    <!-- JS Implementing Plugins -->
    <script src="../assets/vendor/appear.js"></script>
    <script src="../assets/vendor/chosen/chosen.jquery.js"></script>
    <script src="../assets/vendor/image-select/src/ImageSelect.jquery.js"></script>
    <script src="../assets/vendor/hs-megamenu/src/hs.megamenu.js"></script>
    <script src="../assets/vendor/malihu-scrollbar/jquery.mCustomScrollbar.concat.min.js"></script>

    <!-- JS Unify -->
    <script src="../assets/js/hs.core.js"></script>
    <script src="../assets/js/components/hs.header.js"></script>
    <script src="../assets/js/helpers/hs.hamburgers.js"></script>
    <script src="../assets/js/components/hs.dropdown.js"></script>
    <script src="../assets/js/components/hs.scrollbar.js"></script>
    <script src="../assets/js/components/hs.select.js"></script>
    <script src="../assets/js/components/hs.counter.js"></script>
    <script src="../assets/js/components/hs.go-to.js"></script>

    <!-- JS Customization -->
    <script src="../assets/js/custom.js"></script>

    <!-- JS Plugins Init. -->
    <script>
      $(document).on('ready', function () {
        // initialization of header
        $.HSCore.components.HSHeader.init($('#js-header'));
        $.HSCore.helpers.HSHamburgers.init('.hamburger');

        // initialization of HSMegaMenu plugin
        $('.js-mega-menu').HSMegaMenu({
          event: 'hover',
          pageContainer: $('.container'),
          breakpoint: 991
        });

        // initialization of HSDropdown component
        $.HSCore.components.HSDropdown.init($('[data-dropdown-target]'), {
          afterOpen: function () {
            $(this).find('input[type="search"]').focus();
          }
        });

        // initialization of HSScrollBar component
        $.HSCore.components.HSScrollBar.init($('.js-scrollbar'));

        // initialization of go to
        $.HSCore.components.HSGoTo.init('.js-go-to');

        // initialization of custom select
        $.HSCore.components.HSSelect.init('.js-custom-select');

        // initialization of counters
        var counters = $.HSCore.components.HSCounter.init('[class*="js-counter"]');
      });
    </script>
    <script>
	  function findAddr(){
		new daum.Postcode({
	      oncomplete: function(data) {
	        	
	        console.log(data);
	        	
	        // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
	        // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
	        // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
	        var roadAddr = data.roadAddress; // 도로명 주소 변수
	        var jibunAddr = data.jibunAddress; // 지번 주소 변수
	        // 우편번호와 주소 정보를 해당 필드에 넣는다.
	        document.getElementById('sellerZip').value = data.zonecode;
	        if(roadAddr !== ''){
	          document.getElementById("sellerAddr").value = roadAddr;
	          }else if(jibunAddr !== ''){
	            document.getElementById("sellerAddr").value = jibunAddr;
	          }
	      }
	    }).open();
	  }
    </script>
    <script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
  </body>
</html>
