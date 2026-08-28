<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
    <head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"/>
    </head>
    <body >
        <div class="container">

            <div class="card mx-auto" style="max-width:600px;">

                <div class="card-header bg-primary text-white text-center">
                <h3>Employee Registration Form</h3>
                </div>

                <div class="card-body p-4">
                   <form:form modelAttribute="userData" action="processForm" >
                        <div class="mb-3">
                            <label class="form-label">Username</label>
                            <div>
                             <form:input path="username"
                                         class="form-control"
                                         placeholder="Enter Username"/>

                             <form:errors path="username" class="text-danger"/>
                            </div>

                        </div>

                        <div class="mb-3">
                            <label class="form-label">Email Address</label>
                            <div>
                            <form:input path="email"
                                        class="form-control"
                                        placeholder="Enter Email"/>
                            <form:errors path="email" class="text-danger"/>
                            </div>
                        </div>

                        <div class="mb-3">
                        <label class="form-label">Password</label>
                            <div>
                            <form:input path="password"
                                        class="form-control"
                                        placeholder="Enter Password"/>
                            </div>
                            <form:errors path="password" class="text-danger"/>
                        </div>

                        <div class="mb-3">
                        <label class="form-label">Confirm Password</label>
                            <div>
                            <form:input path="confirmPassword"
                                        class="form-control"
                                        placeholder="Confirm Password"/>
                            </div>
                            <form:errors path="confirmPassword" class="text-danger"/>
                        </div>

                         <div >
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