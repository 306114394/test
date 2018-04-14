<html>
<head>
    <title>iframe</title>
</head>
<body>
<div id="wrapper">
    <div class="header">
        <%@ include file="header.jsp"%>
    </div>
    <div class="main">
        <div class="main-arrow"></div>
        <div class="main-left">left
            <%@ include file="menu.jsp"%>
        </div><!-- main-left -->
        <div class="main-right">
            <iframe id="frame-contect"  name="main" class="iframe" width="100%" frameborder="no" border="0" marginwidth="0" marginheight="0" scrolling="yes" allowtransparency="yes"></iframe>
        </div>
    </div>
</div>

</body>
</html>