--- 
title: Task New note diagram (0.4)
---
sequenceDiagram
    participant User
    participant Browser
    participant Server

    User->>Browser: Writes something into the text field
    User->>Browser: Clicks the submit button
    Browser->>Server: Sends a POST request with the new note data
    Server->>Browser: Returns a success status code (e.g. 200 OK)
    Browser->>User: Renders the updated note list on the page, including the new note
