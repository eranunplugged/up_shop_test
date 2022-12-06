# The task

## up_shop_test

You have an API endpoint that returns a list of products from the database provided:
<em>“/api/product”</em>

### First task

You have to create an endpoint that will receive a product by id and return only one product.
The api will return a json object with the following attributes of the product:

- [ ] name
- [ ] price
- [ ] pic_url
- [ ] description

if the product id is invalid return "400 bad request"

### Second task

When receiving a single product you should also connect to a service with url https://8yjme.mocklab.io/api/coupon/$PID.
This api receives a GET request as described above, and returns an 8 character coupon code.
You need to add this coupon to the response sent in the first task. so the response will include

- [ ] name
- [ ] price
- [ ] pic_url
- [ ] description
- [ ] coupon

### Third task

Add unit tests to all the methods you created.

<p>Don't need to upload database The service just need to compile</p>

## Project stack

- [ ] java 17
- [ ] Spring boot
- [ ] MongoDB





