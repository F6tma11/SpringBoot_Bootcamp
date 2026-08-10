<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
    <head>

    <link rel="styleSheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"/>
    </head>
    <body >
    <div class="container mt-5" style="max-width:600px">

        <div class="card mx-auto">

            <div class="card-header  text-black text-center">
                <h3>User Form</h3>
            </div>

               <div class="card-body p-4">

                   <form:form modelAttribute="userData" action="showInfo">

                        <div class="mb-3">

                            <form:input class="form-control"
                                   path="name"
                                   placeholder="Username"/>
                        </div>

                        <div class="mb-3">

                           <form:password class="form-control"
                                          path="password"
                                          placeholder="Password"/>
                        </div>

                      <div class="mb-3">

                      <label class="form-label">Country</label>

                        <form:select path="country"
                                     class="form-select form-control" >

                            <form:option label="Egypt" value="Egypt"/>
                            <form:option label="Brazil" value="Brazil"/>
                            <form:option label="French" value="French"/>
                            <form:option label="Germany" value="Germany"/>

                        </form:select>
                      </div>

                    <div class="mb-3">

                    <label class="form-label d-block">
                    Programming Languages
                    </label>


                    <form:radiobutton path="proLang"
                                   value="Java"
                                   />
                    <label class="form-check-label">
                    Java
                    </label>



                    <form:radiobutton path="proLang"
                                   value="C++"
                                   />
                    <label class="form-check-label">
                    C++
                    </label>



                    <form:radiobutton path="proLang"
                                   value="Python"
                                   />
                    <label class="form-check-label">
                    Python
                    </label>
                    </div>

                    <div class="mb-3">

                     <label class="form-label d-block">
                     Preferred Operating System
                     </label>


                     <form:checkbox path="operatingSystem"
                                    value="Windows"
                                    />
                     <label>
                     Windows
                     </label>



                     <form:checkbox path="operatingSystem"
                                    value="Linux"
                                   />
                     <label >
                     Linux
                      </label>



                      <form:checkbox path="operatingSystem"
                      value="Mac"
                      />
                      <label >
                      Mac
                      </label>

                   <div class="text-center">
                        <button type="submit"
                                class="btn btn-danger px-5 form-control">
                                      Submit
                        </button>
                   </div>
               </form:form>

               </div>


        </div>

    </div>

    </body>
</html>