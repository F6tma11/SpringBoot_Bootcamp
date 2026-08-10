<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>User Info Form</title>

    <link rel="stylesheet"
              href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"/>

</head>

<body class="bg-light">

<div class="container mt-5">

    <div class="card shadow-lg mx-auto" style="max-width: 600px;">

        <div class="card-header bg-primary text-white text-center">
            <h3>User Information</h3>
        </div>

        <div class="card-body p-4">

            <form:form modelAttribute="userData" action="showInfo">

                <div class="mb-3">
                    <label class="form-label">First Name</label>
                    <form:input path="firstName"
                                class="form-control"
                                placeholder="Enter first name"/>
                </div>


                <div class="mb-3">
                    <label class="form-label">Last Name</label>
                    <form:input path="lastName"
                                class="form-control"
                                placeholder="Enter last name"/>
                </div>


                <div class="mb-3">
                    <label class="form-label">Email</label>
                    <form:input path="email"
                                type="email"
                                class="form-control"
                                placeholder="Enter email"/>
                </div>


                <div class="mb-3">
                    <label class="form-label">Birth Date</label>
                    <form:input path="birthDate"
                                type="date"
                                class="form-control"/>
                </div>


                <div class="mb-3">
                    <label class="form-label">Password</label>
                    <form:password path="password"
                                   class="form-control"
                                   placeholder="Enter password"/>
                </div>


                <div class="mb-3">
                    <label class="form-label">Country</label>

                    <form:select path="country"
                                 class="form-select">

                        <form:option value="" label="Choose country"/>

                        <form:option value="Egypt" label="Egypt"/>
                        <form:option value="UK" label="UK"/>
                        <form:option value="Germany" label="Germany"/>
                        <form:option value="French" label="French"/>

                    </form:select>

                </div>


                <div class="mb-3">

                    <label class="form-label d-block">
                        Programming Languages
                    </label>


                    <div class="form-check">
                        <form:checkbox path="languages"
                                       value="Java"
                                       class="form-check-input"/>
                        <label class="form-check-label">
                            Java
                        </label>
                    </div>


                    <div class="form-check">
                        <form:checkbox path="languages"
                                       value="C++"
                                       class="form-check-input"/>
                        <label class="form-check-label">
                            C++
                        </label>
                    </div>


                    <div class="form-check">
                        <form:checkbox path="languages"
                                       value="Python"
                                       class="form-check-input"/>
                        <label class="form-check-label">
                            Python
                        </label>
                    </div>


                </div>


                <div class="text-center">
                    <button type="submit"
                            class="btn btn-primary px-5">
                        Submit
                    </button>
                </div>


            </form:form>

        </div>

    </div>

</div>

</body>
</html>