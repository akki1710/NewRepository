<%@include file="include_css.jsp" %>
<link href="css/style1.css" rel="stylesheet">
        <link href="css/style9.css" rel="stylesheet" type="text/css" media="all"/>
        <style>
            .container{background:transparent}
            .col-md-6{background: rgba(0, 0, 0, 0.63);margin: 0 auto;}
            body{background:url(img/bike.jpg)no-repeat center center;background-size:cover;background-attachment:fixed;}
            .list-group button{padding: .75rem 1.25rem; cursor: pointer; }
            .w3ls-name{width:100%;text-align:left}
            .w3ls-name input[type=text]{width:100%!important}
            #line{text-align:center;margin-left: 0px;}
        </style>
<%@include file="menu.jsp" %>
      
            
          <div class="container">
    <div class="row">
        <div class="col-md-6">
          <p>BIKE INSURANCE</p>
          <h2><span class="label success">Select a Registration Year</span></h2><br>
                    <form action="Servlet1" method="post">
                        <ul class="fields">
                            <div class="Refer_w3l">
                                <h3>&nbsp;&nbsp;&nbsp;&nbsp;Get Free Quotes From Top Insurers</h3><br>

                                <div class="w3ls-name">	
                                    <div id="regno"><i class="fa fa-motorcycle iconpos "></i> Reg. No.</div>
                                    <input type="text" name="bike_reg" onkeydown="upperCaseF(this)" id="cartextbox" placeholder="E.G.: DL01AB1234" pattern="^[a-z|A-Z]{2}[0-9|a-z|A-Z]{1,2}[a-z|A-Z]{1,2}[0-9]{1,4}$" required=" "/>
                                </div>
                                <div class="w3ls-btn">
                                    <input type="submit" value="Compare & Save Big">
                                </div><br><br>

                                <div class="dontKnow dontKnow2" id="line">
                                    "Compare plans from 15+ insurers & save up to 60%"
                                </div>
                                </form>
                            </div>
                            </div>
                            </div>
           <script>
        function upperCaseF(a){
            setTimeout(function(){
                a.value = a.value.toUpperCase();
            }, 1);
        }
        </script>               
<%@include file="footer.jsp" %>