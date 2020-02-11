# create-reframe-app
Template for the Re-frame application (from linter and testing to reagent and reframe)

## Setup And Run

1. Install [Leiningen](http://leiningen.org/)  (plus Java).

2. Get the create-reframe-app repo
   ```
   git clone git@github.com:eshekak/create-reframe-app.git
   ```

3. Clean build
   ```
   lein do clean, shadow watch client
   ```

4. Wait for step 3 to do the compile, and then run the built app:
   ```
   open http://localhost:8280
   ```


## Compile an optimised version

1. Compile
   ```
   lein do clean, shadow release client
   ```

2. Open the following in your browser
   ```
   resources/public/index.html
   ```


