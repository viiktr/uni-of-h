--- 
title: New note in Single page app diagram (0.6)
---
sequenceDiagram
    participant User
    participant Browser
    participant Server

    User->>Browser: Writes something into the text field
    User->>Browser: Clicks the submit button
    Browser->>Server: Sends a POST request with the new note data using XHR or Fetch API
    Server->>Browser: Returns a success status code (e.g. 200 OK) and the updated note list data
    Browser->>User: Renders the updated note list on the page, including the new note, without reloading the page
