<html>

<head>
<link rel="stylesheet"
      href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"/>
</head>

<body class="bg-light">

<div class="container mt-5">

    <div class="card shadow-sm rounded-4 p-5 mx-auto" style="max-width:600px;">

        <h1 class="text-center text-primary mb-4">
            Your Age
        </h1>

        <p class="fs-5 text-secondary">
            Birth Date:
            <span class="fw-bold text-dark">
                ${day}/${month}/${year}
            </span>
        </p>

        <div class="alert alert-success text-center fs-4 fw-bold mt-4">
            Your Age is: ${age}
        </div>

    </div>

</div>

</body>
</html>