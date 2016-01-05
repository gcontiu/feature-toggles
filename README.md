# feature-toggles
Create a demo app for feature toggles using spring boot

## Sceanarios:

Release toggle 1: Change View name from properties file
- have a properties value that determines to display helloA or helloB

Release toggle 2: Have a business functionality that will be replaced if toggle is on.
- have an interface with an implementation

Business toggle: Automatic Toggling as a feature
EG: A/B Testing
- have a logic that based on some probability loads a view or another
- the count of both A and B are logged after each view load


Talk about other methods of toggling:
- db value toggle - might used without restarting the application
- cases where one can't build the abstraction so this will lead to specifying the toggle at the point of use.
