---
title: Single-page app version of the notes app (0.5)
---
sequenceDiagram
    participant User
    participant Browser
    participant Server

    User->>Browser: Navigates to https://studies.cs.helsinki.fi/exampleapp/spa
    Browser->>Server: Sends a GET request for the single page app page
    Server->>Browser: Returns the HTML, CSS, and JavaScript for the single page app
    Browser->>User: Renders the single page app, including the note list and form for creating new notes
