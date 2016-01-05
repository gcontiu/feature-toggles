# feature-toggles
Create a demo app for feature toggles using spring boot

## Sceanarios:

Release toggle 1: Change View name from properties file
- have a properties value that determines to display helloA or helloB

Release toggle 2: Have a business functionality that will be replaced if toggle is on.
- have an interface with an implementation
- add a new implementation and specify inside a properties file which one to use
- having the new functionality working well, we can remove the toggle, the wrapping implementation and the old implementation on the next release

Business toggle: Automatic Toggling as a feature
EG: A/B Testing
- have a logic that based on some probability loads a view or another
- the count of both A and B are logged after each view load



## Other methods of toggling:
Db value toggle - might used without restarting the application
- eg. migrate batches of merchants to new functionality, wait and see if everything is ok, migrate another batch. Try this by adding a column specifying the functionality a merchant should use.

Cases where one can't build the abstraction 
- this might lead to specifying the toggle at the point of use.
- WARNING: you might want to use your creativity so you can invent a point where the toggle can be used.
