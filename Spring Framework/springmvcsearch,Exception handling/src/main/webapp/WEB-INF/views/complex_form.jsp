<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body class="" style="backgroung: #e2e2e2">
	<div class="container mt-4">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<h3>Complex Form</h3>
						<div class="alert alert-danger" role="alert">
						<form:errors path="student.*" />
							
						</div>
						<form action="handleform" method="POST">
							<div class="form-group">
								<label for="name">Your Name</label> <input name="name" id="name"
									type="text" class="form-control" placeholder="your name" />
							</div>
							<div class="form-group">
								<label for="id">Your Id</label> <input name="id" id="id"
									type="text" class="form-control" placeholder="your id" />
							</div>
							<div class="form-group">
								<label for="dob">Your DOB</label> <input name="dob" id="dob"
									type="date" class="form-control" placeholder="your dob" />
							</div>
							<div class="form-group">

								<label for="example">select-course</label> <select
									name="subjects" id="example" class="form-control" multiple>
									<option>core java</option>
									<option>java spring</option>
									<option>java springboot</option>
									<option>java hibernate</option>
								</select>
							</div>
							<div class="form-group">
								<span class="mr-3">select gender</span>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="inlineRadio1" value="male"><label
										class="form-checl-label" for="inlineRadio1">Male</label>
								</div>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="inlineRadio2" value="female"><label
										class="form-checl-label" for="inlineRadio2">Female</label>
								</div>
							</div>
							<div class="form-group">
								<label for="">select type</label><select class="form-control"
									name="type">
									<option value="oldStudent">Old Student</option>
									<option value="normalstudent">Normal Student</option>
								</select>
							</div>

							<div class="card">
								<div class="card-body">
									<p>Your address</p>

									<div class="form-group">
										<input type="text" name="address.street" class="form-control"
											placeholder="enter your street" />
									</div>
									<div class="form-group">
										<input type="text" name="address.city" class="form-control"
											placeholder="enter your city" />
									</div>


								</div>

							</div>

							<div class="container text-center">
								<button type="submit" class="btn btn-primary">Submit</button>
							</div>
						</form>

					</div>
				</div>

			</div>
		</div>
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>