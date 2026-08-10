<html>
    <head>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"/>
    </head>
   <body class="bg-light">

   <div class="container mt-5">

       <div class="card shadow-sm rounded-4 p-5 mx-auto" style="max-width: 500px;">

           <h2 class="text-center text-primary mb-4">
               Age Calculator
           </h2>

           <form action="yourAge">

               <div class="mb-3">
                   <input type="number"
                          class="form-control"
                          name="day"
                          placeholder="Enter Day">
               </div>

               <div class="mb-3">
                   <input type="number"
                          class="form-control"
                          name="month"
                          placeholder="Enter Month">
               </div>

               <div class="mb-4">
                   <input type="number"
                          class="form-control"
                          name="year"
                          placeholder="Enter Year">
               </div>

               <div class="d-grid">
                   <button type="submit" class="btn btn-primary">
                       Calculate Age
                   </button>
               </div>

           </form>

       </div>

   </div>


   </body>
</html>