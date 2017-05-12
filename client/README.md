# Chirp Client

## Initial setup

Navigate to the `client` directory, then run `npm install`.
TODO: Run the following commands as npm tasks.

## Running a server

This command hosts just the static files, not the API. Alternately, you could use the CDK to host both the API and the client locally.

```
./node_modules/.bin/harp server
```

## Running the linter

Alternately, you could use an ESLint plugin for your development environment of choice.

```
./node_modules/.bin/eslint js/index.js
```
