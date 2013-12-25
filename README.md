Area
====

Java implementation of the Area gem
https://github.com/jgv/area

Usage
=====

Coverts zipcode to region
-----------------------------
` Zipcode.toRegion("10013"); // "New York, NY" `

Coverts zipcode to latitude and longitude
-------------------------------------------
` Zipcode.toLatitudeLongitude("10013"); // ["40.720666", "-74.00526"] `
  
Coverts zipcode to latitude
-------------------------------
` Zipcode.toLatitude("10013"); // "40.720666" `
  
Coverts zipcode to longitude
-------------------------------
` Zipcode.toLongitude("10013"); // "-74.00526"`

Converts zipcode toGTM offset
---------------------------------
`Zipcode.toGMTOffset("10013"); //"-5"`

Converts zipcode to observed dst
-----------------------------------
` Zipcode.toObserveDST("10013"); // "1" `
