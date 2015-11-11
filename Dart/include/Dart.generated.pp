[
   Metadata                              -- _1,
   Metadata.1:iter-star                  -- _1,
   Annotation                            -- KW["@"] _1,
   ArgumentAnnotation                    -- KW["@"] _1 KW["("] _2 KW[")"],
   ArgumentAnnotation.2:iter-star-sep    -- _1 KW[","],
   COMPLETION-Metadata                   -- _1,
   COMPLETION-Annotation                 -- _1,
   VariableDeclaration                   -- _1 _2 _3 _4,
   VariableDeclaration.2:opt             -- _1,
   VariableDeclaration.3:opt             -- _1,
   VariableDeclaration.4:iter-sep        -- _1 KW[","],
   DynamicVariableDeclaration            -- _1 KW["var"] _2,
   DynamicVariableDeclaration.2:iter-sep -- _1 KW[","],
   Var                                   -- KW["var"],
   Variable                              -- _1,
   Variable                              -- _1 KW["="] _2,
   COMPLETION-VariableDeclaration        -- _1,
   COMPLETION-Dynamic                    -- _1,
   COMPLETION-Variable                   -- _1,
   COMPLETION-VariableDeclaration        -- _1,
   Block                                 -- V  [V vs=2 [KW["{"] _1] KW["}"]],
   Block.1:iter                          -- _1,
   Expression                            -- _1 KW[";"],
   Expression.1:opt                      -- _1,
   If                                    -- KW["if"] KW["("] _1 KW[")"] _2,
   IfElse                                -- KW["if"] KW["("] _1 KW[")"] _2 KW["else"] _3,
   ForIn                                 -- KW["for"] KW["("] _1 KW["in"] _2 KW[")"] _3,
   While                                 -- KW["while"] KW["("] _1 KW[")"] _2,
   Do                                    -- KW["do"] _1 KW["while"] KW["("] _2 KW[")"] KW[";"],
   Switch                                -- KW["switch"] KW["("] _1 KW[")"] KW["{"] _2 _3 KW["}"],
   Switch.2:iter-star                    -- _1,
   Switch.3:opt                          -- _1,
   SwitchCase                            -- KW["case"] _1 KW[":"] _2,
   SwitchCase.2:iter-star                -- _1,
   DefaultCase                           -- V  [H  [KW["default:"]] _1],
   DefaultCase.1:iter-star               -- _1,
   Rethrow                               -- KW["rethrow"] KW[";"],
   Return                                -- KW["return"] _1 KW[";"],
   Return.1:opt                          -- _1,
   Break                                 -- KW["break"] _1 KW[";"],
   Break.1:opt                           -- _1,
   Continue                              -- KW["continue"] _1 KW[";"],
   Continue.1:opt                        -- _1,
   Yield                                 -- KW["yield"] _1 KW[";"],
   Invoke                                -- _1 KW["("] _2 KW[")"] KW[";"],
   Invoke.2:iter-star-sep                -- _1 KW[","],
   COMPLETION-SwitchCase                 -- _1,
   COMPLETION-DefaultCase                -- _1,
   COMPLETION-Statement                  -- _1,
   Import                                -- KW["import"] _1 _2 KW[";"],
   Import.2:iter-star                    -- _1,
   AliasedImport                         -- KW["import"] _1 KW["as"] _2 _3 KW[";"],
   AliasedImport.3:iter-star             -- _1,
   DeferredImport                        -- KW["import"] _1 KW["deferred"] KW["as"] _2 _3 KW[";"],
   DeferredImport.3:iter-star            -- _1,
   Show                                  -- V  [H  [KW["show"]] _1],
   Show.1:iter-sep                       -- _1 KW[","],
   Hide                                  -- V  [H  [KW["hide"]] _1],
   Hide.1:iter-sep                       -- _1 KW[","],
   COMPLETION-Import                     -- _1,
   COMPLETION-Combinator                 -- _1,
   Function                              -- _1 _2 KW["("] _3 KW[")"] KW["{"] _4 KW["}"],
   Function.1:opt                        -- _1,
   Function.3:iter-star-sep              -- _1 KW[","],
   Function.4:iter-star                  -- _1,
   ShortFunction                         -- _1 _2 KW["("] _3 KW[")"] KW["=>"] _4 KW[";"],
   ShortFunction.1:opt                   -- _1,
   ShortFunction.3:iter-star-sep         -- _1 KW[","],
   COMPLETION-Function                   -- _1,
   Argument                              -- _1,
   NamedArgument                         -- _1 _2,
   Label                                 -- _1 KW[":"],
   COMPLETION-Label                      -- _1,
   This                                  -- KW["this"],
   Ref                                   -- _1,
   Throw                                 -- KW["throw"] _1,
   New                                   -- KW["new"] _1 KW["("] _2 KW[")"],
   New.2:iter-star-sep                   -- _1 KW[","],
   Min                                   -- _1 _2,
   Min.1:ci-lit                          -- _1,
   Min.1:ci-lit.1:"-"                    -- ,
   Neg                                   -- _1 _2,
   Neg.1:ci-lit                          -- _1,
   Neg.1:ci-lit.1:"!"                    -- ,
   Mul                                   -- _1 _2 _3,
   Mul.2:ci-lit                          -- _1,
   Mul.2:ci-lit.1:"*"                    -- ,
   Div                                   -- _1 _2 _3,
   Div.2:ci-lit                          -- _1,
   Div.2:ci-lit.1:"/"                    -- ,
   Mod                                   -- _1 _2 _3,
   Mod.2:ci-lit                          -- _1,
   Mod.2:ci-lit.1:"%"                    -- ,
   IntDiv                                -- _1 _2 _3,
   IntDiv.2:ci-lit                       -- _1,
   IntDiv.2:ci-lit.1:"~/"                -- ,
   Add                                   -- _1 _2 _3,
   Add.2:ci-lit                          -- _1,
   Add.2:ci-lit.1:"+"                    -- ,
   Sub                                   -- _1 _2 _3,
   Sub.2:ci-lit                          -- _1,
   Sub.2:ci-lit.1:"-"                    -- ,
   LShift                                -- _1 _2 _3,
   LShift.2:ci-lit                       -- _1,
   LShift.2:ci-lit.1:"<<"                -- ,
   RShift                                -- _1 _2 _3,
   RShift.2:ci-lit                       -- _1,
   RShift.2:ci-lit.1:">>"                -- ,
   BitAnd                                -- _1 _2 _3,
   BitAnd.2:ci-lit                       -- _1,
   BitAnd.2:ci-lit.1:"&"                 -- ,
   BitXor                                -- _1 _2 _3,
   BitXor.2:ci-lit                       -- _1,
   BitXor.2:ci-lit.1:"^"                 -- ,
   BitOr                                 -- _1 _2 _3,
   BitOr.2:ci-lit                        -- _1,
   BitOr.2:ci-lit.1:"|"                  -- ,
   Lt                                    -- _1 _2 _3,
   Lt.2:ci-lit                           -- _1,
   Lt.2:ci-lit.1:"<"                     -- ,
   Gt                                    -- _1 _2 _3,
   Gt.2:ci-lit                           -- _1,
   Gt.2:ci-lit.1:">"                     -- ,
   Lte                                   -- _1 _2 _3,
   Lte.2:ci-lit                          -- _1,
   Lte.2:ci-lit.1:"<="                   -- ,
   Gte                                   -- _1 _2 _3,
   Gte.2:ci-lit                          -- _1,
   Gte.2:ci-lit.1:">="                   -- ,
   As                                    -- _1 _2 _3,
   As.2:ci-lit                           -- _1,
   As.2:ci-lit.1:"as"                    -- ,
   Is                                    -- _1 _2 _3,
   Is.2:ci-lit                           -- _1,
   Is.2:ci-lit.1:"is"                    -- ,
   IsNot                                 -- _1 _2 _3,
   IsNot.2:ci-lit                        -- _1,
   IsNot.2:ci-lit.1:"is!"                -- ,
   Eq                                    -- _1 _2 _3,
   Eq.2:ci-lit                           -- _1,
   Eq.2:ci-lit.1:"=="                    -- ,
   Neq                                   -- _1 _2 _3,
   Neq.2:ci-lit                          -- _1,
   Neq.2:ci-lit.1:"!="                   -- ,
   LogicAnd                              -- _1 _2 _3,
   LogicAnd.2:ci-lit                     -- _1,
   LogicAnd.2:ci-lit.1:"&&"              -- ,
   LogicOr                               -- _1 _2 _3,
   LogicOr.2:ci-lit                      -- _1,
   LogicOr.2:ci-lit.1:"||"               -- ,
   IfNull                                -- _1 _2 _3,
   IfNull.2:ci-lit                       -- _1,
   IfNull.2:ci-lit.1:"??"                -- ,
   Conditional                           -- _1 _2 _3 _4 _5,
   Conditional.2:ci-lit                  -- _1,
   Conditional.2:ci-lit.1:"?"            -- ,
   Conditional.4:ci-lit                  -- _1,
   Conditional.4:ci-lit.1:":"            -- ,
   Cascade                               -- _1 _2 _3,
   Cascade.2:ci-lit                      -- _1,
   Cascade.2:ci-lit.1:".."               -- ,
   Assign                                -- _1 KW["="] _2,
   MulAssign                             -- _1 KW["*="] _2,
   DivAssign                             -- _1 KW["/="] _2,
   IntDivAssign                          -- _1 KW["~/="] _2,
   ModAssign                             -- _1 KW["%="] _2,
   AddAssign                             -- _1 KW["+="] _2,
   SubAssign                             -- _1 KW["-="] _2,
   LShiftAssign                          -- _1 KW["<<="] _2,
   RShiftAssign                          -- _1 KW[">>="] _2,
   BitAndAssign                          -- _1 KW["&="] _2,
   BitXorAssign                          -- _1 KW["^="] _2,
   BitOrAssign                           -- _1 KW["|="] _2,
   NullAssign                            -- _1 KW["??="] _2,
   COMPLETION-Expression                 -- _1,
   Null                                  -- KW["null"],
   List                                  -- _1 KW["["] _2 KW["]"],
   List.1:opt                            -- _1,
   List.2:iter-star-sep                  -- _1 KW[","],
   TypedList                             -- _1 _2 KW["["] _3 KW["]"],
   TypedList.1:opt                       -- _1,
   TypedList.3:iter-star-sep             -- _1 KW[","],
   Map                                   -- _1 KW["{"] _2 KW["}"],
   Map.1:opt                             -- _1,
   Map.2:iter-star-sep                   -- _1 KW[","],
   TypedMap                              -- _1 _2 KW["{"] _3 KW["}"],
   TypedMap.1:opt                        -- _1,
   TypedMap.3:iter-star-sep              -- _1 KW[","],
   MapEntry                              -- _1 KW[":"] _2,
   True                                  -- KW["true"],
   False                                 -- KW["false"],
   Number                                -- _1,
   HexNumber                             -- _1,
   String                                -- _1,
   Symbol                                -- V  [H  [KW["#"]] _1],
   Symbol.1:iter-sep                     -- _1 KW["."],
   COMPLETION-MapEntry                   -- _1,
   COMPLETION-Expression                 -- _1,
   Enum                                  -- _1 KW["enum"] _2 KW["{"] _3 KW["}"],
   Enum.3:iter-sep                       -- _1 KW[","],
   Enum                                  -- _1 KW["enum"] _2 KW["{"] _3 KW[","] KW["}"],
   Enum.3:iter-sep                       -- _1 KW[","],
   COMPLETION-Enum                       -- _1,
   Paramters                             -- KW["("] _1 _2 KW[")"],
   Paramters.1:iter-star-sep             -- _1 KW[","],
   Paramters.2:opt                       -- _1,
   Positional                            -- KW["["] _1 KW["]"],
   Positional.1:iter-sep                 -- _1 KW[","],
   Named                                 -- KW["{"] _1 KW["}"],
   Named.1:iter-sep                      -- _1 KW[","],
   Param                                 -- _1,
   InitializedParam                      -- _1 KW["="] _2,
   NamedParam                            -- _1,
   NamedInitializedParam                 -- _1 KW[":"] _2,
   COMPLETION-Parameters                 -- _1,
   COMPLETION-OptionalParameters         -- _1,
   COMPLETION-Parameter                  -- _1,
   COMPLETION-SimpleFormalParameter      -- _1,
   COMPLETION-NamedParameter             -- _1,
   COMPLETION-SimpleFormalParameter      -- _1,
   Final                                 -- KW["final"],
   Const                                 -- KW["const"],
   COMPLETION-Modifier                   -- _1,
   Type                                  -- _1,
   Generic                               -- _1 _2,
   TypeArguments                         -- KW["<"] _1 KW[">"],
   TypeArguments.1:iter-sep              -- _1 KW[","],
   COMPLETION-Type                       -- _1,
   COMPLETION-TypeArguments              -- _1,
   Class                                 -- _1 _2 KW["class"] _3 _4 _5 _6 _7 KW["{"] _8 KW["}"],
   Class.2:opt                           -- _1,
   Class.4:opt                           -- _1,
   Class.5:opt                           -- _1,
   Class.6:opt                           -- _1,
   Class.7:opt                           -- _1,
   Class.8:iter-star                     -- _1,
   MixinApplication                      -- _1 _2 KW["class"] _3 _4 KW["="] _5 KW["with"] _6 _7 KW[";"],
   MixinApplication.2:opt                -- _1,
   MixinApplication.4:opt                -- _1,
   MixinApplication.6:iter-sep           -- _1 KW[","],
   MixinApplication.7:opt                -- _1,
   Abstract                              -- KW["abstract"],
   Parent                                -- KW["extends"] _1,
   TypeParameters                        -- KW["<"] _1 KW[">"],
   TypeParameters.1:iter-sep             -- _1 KW[","],
   TypeParameter                         -- _1 _2 _3,
   TypeParameter.3:opt                   -- _1,
   Mixins                                -- V  [H  [KW["with"]] _1],
   Mixins.1:iter-sep                     -- _1 KW[","],
   Interfaces                            -- V  [H  [KW["implements"]] _1],
   Interfaces.1:iter-sep                 -- _1 KW[","],
   Declaration                           -- KW["x;"],
   Constructor                           -- _1 _2 KW["{"] _3 KW["}"],
   Constructor.3:iter-star               -- _1,
   COMPLETION-Class                      -- _1,
   COMPLETION-Abstract                   -- _1,
   COMPLETION-Parent                     -- _1,
   COMPLETION-TypeParameters             -- _1,
   COMPLETION-TypeParameter              -- _1,
   COMPLETION-Mixins                     -- _1,
   COMPLETION-Interfaces                 -- _1,
   COMPLETION-ClassMember                -- _1,
   COMPLETION-Class                      -- _1,
   Program                               -- _1,
   Program.1:iter-star                   -- _1,
   DeclarationStmt                       -- _1 KW[";"],
   COMPLETION-Tld                        -- _1
]