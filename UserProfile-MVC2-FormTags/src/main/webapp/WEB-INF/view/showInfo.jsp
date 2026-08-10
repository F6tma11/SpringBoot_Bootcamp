<html>

<head>
<link rel="stylesheet"
      href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"/>
</head>

<body class="bg-light">

<div class="container mt-5">

    <div class="card shadow-sm rounded-4 p-5 mx-auto" style="max-width:600px;">

        <h1 class="text-center text-primary mb-4">
            Your Data
        </h1>

        <p class="fs-10 text-secondary">
            Fist Name:
            <span class="fw-bold text-dark">
            ${userInfo.firstName}
            </span>
        </p>

        <p class="fs-10 text-secondary">
        Last Name:
        <span class="fw-bold text-dark">
        ${userInfo.lastName}
        </span>
        </p>

       <p class="fs-10 text-secondary">
        Email:
        <span class="fw-bold text-dark">
        ${userInfo.email}
        </span>
        </p>

        <p class="fs-10 text-secondary">
                BirthDate:
                <span class="fw-bold text-dark">
                ${userInfo.birthDate}
                </span>
        </p>

        <p class="fs-10 text-secondary">
                        Country:
                        <span class="fw-bold text-dark">
                        ${userInfo.country}
                        </span>
                </p>

                <p class="fs-5 text-secondary">
                                Languages:
                                <span class="fw-bold text-dark">
                                ${userInfo.languages}
                                </span>
                        </p>


    </div>

</div>

</body>
</html>