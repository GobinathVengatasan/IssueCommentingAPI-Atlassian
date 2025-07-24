**IssueCommentingAPI-Atlassian Plugin**

**About :** 
This API has below two endpoints for adding and retrieving issue comments.

1. POST /api/comments - This is to add new issue comments with message & author name
2. GET /api/comments?author={authorName} = This is to retreive the existing issue comment of given authorName

**Build, Deploy and Run Test Service :**

**Prerequisite :**

1. Windows / Linux machine
2. Git version control to download the code
3. Java 8+ Version (with Environment variable setup)
4. Atlassian-plugin-sdk-9.1.1 with running setup (Environment variable setup)
5. Postman for testing

**Steps to Build Code :**

1. Clone the code using Git tool
2. Open the command prompt
3. Run **"atlas-package"** in the folder path **\IssueCommentingAPI-Atlassian**

**Deploy the Code :**

1. After **"atlas-package"** command, the \IssueCommentingAPI-Atlassian\target folder will be generated with library jars and plugins.
2. Now run **"atlas-run"** to run self deploy and self start of the REST application.
3. The application will be started and listening to the port **5990**

**Test the service in Postman :**

1. Open the postman
2. Download the postman collections "IssueCommentingAPI.postman_collection.json" provided in the git
3. Import the collections into postman
4. Test all the endpoints