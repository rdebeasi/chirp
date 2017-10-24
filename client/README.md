# Chirp Client

## Initial setup

Install [Node.js](https://nodejs.org/) if it isn't already installed. Then, navigate to the `client` directory, then run `npm install`.

## Running a server

To run a dev server on port 9000:
```
npm run dev
```

To run a production server on port 8080:
```
npm start
```

Right now, the only difference between dev and prod is the port number. In the future, we could set `NODE_ENV`, minify files, etc.

This command hosts just the static files, not the API. Alternately, you could use the [CDK](https://developers.redhat.com/products/cdk/overview/) to host both the API and the client locally.

## Running the linter

```
npm run lint
```

Alternately, you could use an ESLint plugin for your development environment of choice.
