# chirp
Demo of a social network with donations

## URLs
http://chirp-chirp.apps.ehealth.rht-labs.com/v1/messages

## Goals
- simple page with vue code reaching out to a REST endpoint
(promises), and showing the response on the page
- vue code that shows promise chain, and templating
- tests (vue, spring boot)
- readme that explains what this is
- use bootstrap, BUT include separate style sheet to show cascading
and selectors
- keep everything within the platform
- have interface in swagger
- no database interaction

## Business Process
Message board with ability to send money

- view: get messages with a input text area on top to post a message
and lets you include a donation with the message and a recipient
-two rest endpoints one to take the message and another to validate a
card number with exp date and cve
- show rest response on the view (show error handling)
