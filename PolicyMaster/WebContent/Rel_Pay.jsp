<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1" runat="server">
    <title></title>

    <script language="javascript" type="text/javascript">
        function submitHealthForm() {
          
     document.PAYMENTFORM.submit();

        }        
         
    </script>
</head>
<body>
    <form action='https://rhicluat.religare.com/portalui/PortalPayment.run' name='PAYMENTFORM' method='post'>
    <div>
    <input type='hidden' name='proposalNum' value='<%= (String) session.getAttribute("rel_two_proposal_num")%>' />
	<input type='hidden' name='returnURL' value="http://localhost:8080/PolicyMaster/Rel_Pol_Status"/>	
	<!-- <input type='hidden' name='returnURL' value="http://203.122.13.228/PolicyMaster/Rel_Pol_Status"/> -->
	</div>
  	<script language='javascript' type="text/javascript">      
	submitHealthForm();</script>
    </form>
</body>
</html>