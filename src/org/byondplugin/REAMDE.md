If you want to recreate DMLexer.java and DMParser.Java then:

$ antlr4 -no-listener -o path_to_gen_org_byondplugin -package org.byondplugin DM.g4

If you want to test grammar:

$ antlr4 -visitor -no-listener -o path_to_gen_org_byondplugin DM.g4
$ cd path_to_gen_org_byondplugin
$ javac *.java
$ grun DM start testfile.dm -tokens
$ grun DM start testfile.dm -gui
