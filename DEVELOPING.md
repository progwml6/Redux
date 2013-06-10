# Developing with Redux

## Adding the AT
In your Forge src install, under forge/ create the folder 'accesstransformers'. Copy resources/redux_at.cfg into this directory, then reinstall Forge.

## Loading the dummy jar
Copy Redux_dummy.jar to forge/mcp/jars/coremods/ in order for Redux to load during debug runs.
(Technical aside: This jar provides the needed MANIFEST.MF entry for FML to find our mod loader class, in the asm package)

# Code style guidelines
For the most part, follow the [Scala community code style](http://docs.scala-lang.org/style/), with the following exceptions:

- In more complex classes, 'sections' of code can be defined like so:
```
    //=== Section Header ============================
```
The line should always end at column 54, regardless of indent. Ideally, only set these with one level of indent, so they're all consistent.

- Indents: Unlike the Style guide, we use **4-space tabs**.
- Comments: All files have a standard header:
```
    /*
     * ClassName
     * io.ecu.redux.packagename
     */
```
In addition, every class/object/trait should have a Scaladoc in form:
```
    /*
     * Short description
     *
     * Optional long description, or notes
     *
     * @author List of Contributors to this file
     */
```
Note we do not document @param entries. Try and makr your parameter names self-explanatory. For methods, we use this style:
```
    /*
     * Short description
     *
     * Optional long description, or notes
     *
     * @param paramName One @param per parameter
     * @return What the method returns. If Unit (void/null), omit this line.
     */
```
If needed, you can also add @note or @todo entries as required.