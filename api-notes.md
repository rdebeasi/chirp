# Messages

## GET

Returns a list of posts, each with an id and text. Optionally, a post can also have a donation.
A donation includes an amount, currency, org ID, and org name.

## POST

Send a post with text and (optionally) a donation token.

### Responses

200 - OK. Return post object?
400 - Input is invalid. Return 'reason' string?
403 - Input is valid, but token was rejected. Return 'reason' string?

# Payments

In the real world, this endpoint would be provided by Stripe, PayPal, CyberSource, etc.

## GET

Returns error 403. In the future, we might allow administrators to get a list of all payments for reporting.

## POST

Send a credit card number, amount, and currency.
If successful, returns a token.

### Responses

200 - OK. Returns token.
400 - Input is invalid. Return 'reason' string?
403 - Input is valid, but card was rejected. Return 'reason' string.
