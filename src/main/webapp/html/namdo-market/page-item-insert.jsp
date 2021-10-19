<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    

<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Title -->
    <title>E-commerce Help Page | Unify - Responsive Website Template</title>

    <!-- Required Meta Tags Always Come First -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">

    <!-- Favicon -->
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/html/favicon.ico">

    <!-- Google Fonts -->
    <link rel="stylesheet" href="//fonts.googleapis.com/css?family=Roboto:300,400,500,700,900">

    <!-- CSS Global Compulsory -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/icon-line/css/simple-line-icons.css">

    <!-- CSS Implementing Plugins -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/icon-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/icon-line-pro/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/jquery-ui/themes/base/jquery-ui.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/chosen/chosen.css">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/icon-hs/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/animate.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/hamburgers/hamburgers.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/hs-megamenu/src/hs.megamenu.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/vendor/malihu-scrollbar/jquery.mCustomScrollbar.min.css">

    <!-- CSS Unify Theme -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/namdo-market/assets/css/styles.e-commerce.css">

    <!-- CSS Customization -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/html/assets/css/custom.css">
    
    <script type="text/javascript">
	    function form_check() {
	    	  
	    	  var itemName = document.getElementById("itemName");
	    	  var categoryNo = $("#categoryNo option:selected");
	    	  var regionNo = $("#regionNo option:selected");
	    	  var itemPrice = document.getElementById("itemPrice");
	    	  var itemStock = document.getElementById("itemStock");	    	
	    	  var itemDescription = document.getElementById("itemDescription");
	    	
	    	  var mainImg = document.getElementById("mainImg");
	    	  var detailImg = document.getElementById("detailImg");
	    	  
	    	  
		    	if ( itemName.value == "" ) {
		    	    alert( "상품이름을 확인해주세요." );
		    	    f.itemName.focus();
		    		return false;
		        }
	
		    	if ( categoryNo.val() == "0" ) {
		            alert( "카테고리를 선택해주세요." );
		            f.category.focus();
		            return false;
		        }
		    	
		    	if ( regionNo.val() == "0" ) {
		            alert( "지역을 선택해주세요." );
		            f.regionNo.focus();
		            return false;
		        }
		    	
		    	if ( itemPrice.value == "" || itemPrice.value.length>9) {
		            alert( "상품 가격을 확인 주세요." );
		            itemPrice.focus();
		            return false;
		        }
	
		    	if ( itemStock.value == "" || itemStock.value.length>3) {
		            alert( "상품 재고수를 확인 주세요." );
		            itemStock.focus();
		            return false;
		        }

		    	if ( itemDescription.value == "" || itemDescription.value.length>300) {
		            alert( "상품 설명 확인 주세요." );
		            itemDescription.focus();
		            return false;
		        }

		    	
		    	if ( mainImg.value == "" ) {
		            alert( "메인 이미지를 넣어주세요." );
		            return false;
		        }
		    	
		    	if ( detailImg.value == "" ) {
		            alert( "상품 상세 이미지를 넣어주세요." );
		            return false;
		        }
		    	
		        alert("유효성체크완료");
		    	document.itemInsert_form.submit(); //유효성 검사의 포인트 

	    }
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
              <a class="u-link-v5 g-color-text" href="${pageContext.request.contextPath}/html/namdo-market/home-page.jsp">요거 묵어봤는감?</a>
              <i class="g-color-gray-light-v2 g-ml-5 fa fa-angle-right"></i>
            </li>
            <li class="list-inline-item g-mr-5">
              <a class="u-link-v5 g-color-text" href="${pageContext.request.contextPath}/html/namdo-market/page-service-center.jsp">고객센터</a>
              <i class="g-color-gray-light-v2 g-ml-5 fa fa-angle-right"></i>
            </li>
            <li class="list-inline-item g-color-primary">
              <span>아이템등록</span>
            </li>
          </ul>
        </div>
      </section>
      <!-- End Breadcrumbs -->

      <!-- Help -->
      <form name="itemInsert_form" method="post" action="${pageContext.request.contextPath}/front?key=item&methodName=insert" enctype="multipart/form-data">

      <div class="container g-pt-70 g-pb-70">
        <div class="row g-mb-20">
          <h2 class="mb-5">아이템등록</h2>
          <div class="col-md-8 g-mb-30">
            <!-- Tab panes -->
            <div id="nav-5-3-primary-ver" class="tab-content g-pt-20 g-pt-0--md">

				<br><br><br>
                <!-- Accordion -->
                <div id="accordion-12-1" class="u-accordion u-accordion-color-primary" role="tablist" aria-multiselectable="true">
                  <div class="g-overflow-x-scroll g-overflow-x-visible--lg">
                    
                    <table class="text-left w-100">
                      <thead class="h6 g-brd-bottom g-brd-gray-light-v3 g-color-black text-uppercase">
                        <tr>
                        <th>
                          <!-- End Products Block -->
		                  
		                  
		                  <div class="input-group mb-1">
		                    <b class="h5 g-color-black">상품명:&nbsp;&nbsp;&nbsp;</b><input id="itemName" name="itemName" class="form-control g-color-black g-bg-white g-bg-white--focus g-brd-gray-light-v3 g-rounded-left-3 g-rounded-right-3 mr-3"  style="width:70%;" type="text">
		                  
		                  <b class="h5 g-color-black">카테고리:&nbsp;&nbsp;&nbsp;</b>
		                    <select id="categoryNo" name="categoryNo" class="js-custom-select u-select-v1 h-50 g-brd-gray-light-v3 g-color-gray-dark-v5 rounded mr-3" style="width:15%;">
		                      <option value="0"></option>
		                      <option value="1">생선</option>
		                      <option value="2">건어물</option>
		                      <option value="3">김/해초</option>
		                      <option value="4">해산물/어패류</option>
		                      <option value="5">젓갈</option>
		                      <option value="6">수산물 기타</option>
		                      
		                    </select>
		
				              <b class="h5 g-color-black">지역:&nbsp;&nbsp;&nbsp;</b>
		                    <select id="regionNo" name="regionNo" class="js-custom-select u-select-v1 h-50 g-brd-gray-light-v3 g-color-gray-dark-v5 rounded mr-3" style="width:15%;">
		                      <option value="0"></option>
		                      <option value="1">영광</option>
		                      <option value="2">목포</option>
		                      <option value="3">무안</option>
		                      <option value="4">보성</option>
		                      <option value="5">신안</option>
		                      <option value="6">여수</option>
		                      <option value="7">완도</option>
		                      <option value="8">해남</option>
		                      
		                    </select>
		                   
		                  </div>
		                  
		                  
		                  <div class="input-group mb-1">
		                    <b class="h5 g-color-black">상품 가격:&nbsp;&nbsp;&nbsp;</b><input id="itemPrice" name="itemPrice" placeholder="원 단위" class="form-control g-color-black g-bg-white g-bg-white--focus g-brd-gray-light-v3 g-rounded-left-3 g-rounded-right-3 mr-3 col-md-2 col-lg-2 col-sm-2"  style="width:70%;" type="text">
		                    <b class="h5 g-color-black">상품 재고량:&nbsp;&nbsp;&nbsp;</b><input id="itemStock" name="itemStock" class="form-control g-color-black g-bg-white g-bg-white--focus g-brd-gray-light-v3 g-rounded-left-3 g-rounded-right-3 mr-3 col-md-2 col-lg-2 col-sm-2" type="text">
		                                       
		                  </div>                  	                  
		                  
                        <br>
                        </th>
                        </tr>
                      </thead>

                      <tbody>
                        <!-- Item-->
                        
                        <tr class="g-brd-bottom g-brd-gray-light-v3">
                          <td><textarea class="text-left g-py-70" id="itemDescription" name="itemDescription" style="border: none; outline: none;" cols="100%" placeholder="상품 설명"></textarea></td> 
                        </tr>
                        <tr>
							<td>메인이미지 : <input type="file" name="mainImg" id="mainImg" maxlength="60" size="40" accept="image/jpeg, image/png, image/jpg"></td>
						</tr>

                        <tr>
							<td>상품 상세 이미지 : <input type="file" name="detailImg" id="detailImg" maxlength="60" size="40" accept="image/jpeg, image/png, image/jpg"></td>
						</tr>
						
                        
						
                        <!-- End Item-->

                      </tbody>
                    </table>
                    
                    <div class="col-md-8 g-mb-30">
		              
		            </div>
                  </div>
                  <!-- End Products Block -->

                  
                </div>
                <!-- End Accordion -->
               <!-- Contact Form -->
		            
		                <div class="text-center">
		                  <button class="btn u-btn-primary g-font-size-12 text-uppercase g-py-12 g-px-25" type="button"  onclick="form_check()"><b>등록하기</b></button>&nbsp;&nbsp;&nbsp;&nbsp;<button class="btn g-color-gray-dark-v5 g-bg-secondary g-font-size-12 text-uppercase g-py-12 g-px-25" type="button" id="cancel"><b>취소하기</b></button>
		                </div>
		              
		              <!-- End Contact Form -->
            </div>
            <!-- End Tab panes -->
          </div>
      </div>
      
      <!-- End Help -->
      </div>
      </form>

      <!-- Call to Action -->

      <!-- End Call to Action -->

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
    <script src="${pageContext.request.contextPath}/html/assets/vendor/jquery/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/vendor/jquery-migrate/jquery-migrate.min.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/vendor/popper.js/popper.min.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/vendor/bootstrap/bootstrap.min.js"></script>

    <!-- JS Implementing Plugins -->
    <script src="${pageContext.request.contextPath}/html/assets/vendor/appear.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/vendor/chosen/chosen.jquery.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/vendor/hs-megamenu/src/hs.megamenu.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/vendor/malihu-scrollbar/jquery.mCustomScrollbar.concat.min.js"></script>

    <!-- JS Unify -->
    <script src="${pageContext.request.contextPath}/html/assets/js/hs.core.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/js/components/hs.header.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/js/helpers/hs.hamburgers.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/js/components/hs.dropdown.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/js/components/hs.scrollbar.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/js/components/hs.go-to.js"></script>
    <script src="${pageContext.request.contextPath}/html/assets/js/components/hs.tabs.js"></script>

    <!-- JS Customization -->
    <script src="${pageContext.request.contextPath}/html/assets/js/custom.js"></script>

    <!-- JS Plugins Init. -->
    <script>
      $(document).on('ready', function () {
        // initialization of header
        $.HSCore.components.HSHeader.init($('#js-header'));
        $.HSCore.helpers.HSHamburgers.init('.hamburger');

        // initialization of HSMegaMenu component
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

        // Tabs
        $.HSCore.components.HSTabs.init('[role="tablist"]');
      });

      $(window).on('resize', function () {
        setTimeout(function () {
          $.HSCore.components.HSTabs.init('[role="tablist"]');
        }, 200);
      });
    </script>
    <script>
      $(function(){
    	 $("#cancel").click(function(){
    		 confirm("취소하시겠습니까?") ? location.href="${path}/front" : "취소";
    	 }) 
      });
    </script>
    
  </body>
</html>
