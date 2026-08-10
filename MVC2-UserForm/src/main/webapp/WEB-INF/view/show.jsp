<html>

<head>
<link rel="stylesheet"
      href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"/>
</head>

<body class="bg-light">

<div class="container mt-5">

    <div class="card shadow-sm rounded-4 p-5 mx-auto" style="max-width:600px;">

        <h1 class="text-center text-black mb-4">
            Your Data
        </h1>

        <p class="fs-10 text-secondary">
            UserName:
            <span class="fw-bold text-dark">
            ${userInfo.name}
            </span>
        </p>



       <p class="fs-10 text-secondary">
        Country:
        <span class="fw-bold text-dark">
        ${userInfo.country}
        </span>
        </p>

        <p class="fs-10 text-secondary">
                Preferred Programming Language:
                <span class="fw-bold text-dark">
                ${userInfo.proLang}
                </span>
        </p>

        <p class="fs-10 text-secondary">
                        Preferred Operating System:
                        <span class="fw-bold text-dark">
                        ${userInfo.operatingSystem}
                        </span>
                </p>



    </div>

</div>

</body>
</html>