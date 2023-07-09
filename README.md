# sudoku-java

This is simple sudoku Backend project.

We have four url as of now the urls end points are
	
### `GET -> localhost:8765/sudoku/start`
When you save your progress in a game of Sudoku, the endpoint serves as a reference point. By heating up the endpoint, you can retrieve the current state of the game you were playing when you left it.
	
### `PATCH -> localhost:8765/sudoku/add/{matrixId}`
When you input valid data into a Sudoku matrix, it will update the corresponding cell with the provided value and return the updated Sudoku matrix. However, if the data you input is not valid according to the rules of Sudoku, it will return the following response:
     {
      "code": "SUDOKU_INVALID_NUMBER",
      "status": 400,
      "message": "2 is invalid number"
     }
	
### `GET -> localhost:8765/sudoku/{matrixId}`
It will generate and return a Sudoku matrix.
	
### `GET -> localhost:8765/sudoku/new`
Generate a fresh Sudoku matrix and provide the newly created matrix along with its unique identifier (matrixId).
	
In response we return below response.
		
		{"matrixId":5,
		 "missingDigits":44,
		 "matrix":[[3,0,0,0,0,0,8,9,7],
				   [0,2,9,5,0,7,0,0,4],
				   [0,0,4,9,0,0,0,5,2],
				   [0,0,7,3,0,0,0,8,5],
				   [0,0,0,6,0,0,9,0,1],
				   [0,9,0,0,0,5,2,0,3],
				   [5,3,0,8,7,9,0,0,6],
				   [0,0,0,2,5,1,0,0,9],
				   [0,0,2,0,0,0,5,0,8]]
		}
	
The variable "matrixId" represents the id of sudoku matrix.
The variable "matrix" represents the sudoku matrix.
The variable "missingDigits" represents the count of uninserted digits in the Sudoku game, indicating how many digits need to be added to complete the game. When "missingDigits" equals zero, it signifies that the game is fully solved and no further digits need to be inserted for completion.

# DEPLOYMENT INSTRUCTION  

After unzipping the folder, import the Sudoku Java project.

	Import the project in eclips
	1.From the File menu, select Import. The Select screen opens.
	2. Expand Maven and select Existing Maven Projects.
	3. Click Next.
	4. For Root Directory, click Browse and select the top-level project folder.
	5. Verify that the Projects list includes all subprojects and click Finish.
	
	For Import poject in intellij you can go https://www.lagomframework.com/documentation/1.6.x/java/IntellijMaven.html
	
Please include your database password and URL in the application.properties file. Additionally, create the Sudoku schema and execute the following query to create the required table:
	
    CREATE SCHEMA sodoku;
	
    CREATE TABLE sudoku_matrix ( metrix_id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,current_game CHAR(1),missing_digits INT,
    row_1_col_1 INT,row_1_col_2 INT,row_1_col_3 INT,row_1_col_4 INT,row_1_col_5 INT,row_1_col_6 INT,row_1_col_7 INT,row_1_col_8 INT,row_1_col_9 INT,
    row_2_col_1 INT,row_2_col_2 INT,row_2_col_3 INT,row_2_col_4 INT,row_2_col_5 INT,row_2_col_6 INT,row_2_col_7 INT,row_2_col_8 INT,row_2_col_9 INT,
    row_3_col_1 INT,row_3_col_2 INT,row_3_col_3 INT,row_3_col_4 INT,row_3_col_5 INT,row_3_col_6 INT,row_3_col_7 INT,row_3_col_8 INT,row_3_col_9 INT,
    row_4_col_1 INT,row_4_col_2 INT,row_4_col_3 INT,row_4_col_4 INT,row_4_col_5 INT,row_4_col_6 INT,row_4_col_7 INT,row_4_col_8 INT,row_4_col_9 INT,
    row_5_col_1 INT,row_5_col_2 INT,row_5_col_3 INT,row_5_col_4 INT,row_5_col_5 INT,row_5_col_6 INT,row_5_col_7 INT,row_5_col_8 INT,row_5_col_9 INT,
    row_6_col_1 INT,row_6_col_2 INT,row_6_col_3 INT,row_6_col_4 INT,row_6_col_5 INT,row_6_col_6 INT,row_6_col_7 INT,row_6_col_8 INT,row_6_col_9 INT,
    row_7_col_1 INT,row_7_col_2 INT,row_7_col_3 INT,row_7_col_4 INT,row_7_col_5 INT,row_7_col_6 INT,row_7_col_7 INT,row_7_col_8 INT,row_7_col_9 INT,
    row_8_col_1 INT,row_8_col_2 INT,row_8_col_3 INT,row_8_col_4 INT,row_8_col_5 INT,row_8_col_6 INT,row_8_col_7 INT,row_8_col_8 INT,row_8_col_9 INT,
    row_9_col_1 INT,row_9_col_2 INT,row_9_col_3 INT,row_9_col_4 INT,row_9_col_5 INT,row_9_col_6 INT,row_9_col_7 INT,row_9_col_8 INT,row_9_col_9 INT);

After importing the project, right-click on the project and select "Run As" followed by "Maven Install". Once the build is successful, you can run the project.

Executing "Maven Install" will generate the necessary model classes and interfaces required for the project.

