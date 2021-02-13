//调试表原始对象
{
        "title":"调试：com.intellij.database.psi.DbTableImpl",
        "methodList":[{
        "name":"isSystem",
        "desc":"public boolean com.intellij.database.psi.DbTableImpl.isSystem()",
        "value":"false"
        },{
        "name":"isTemporary",
        "desc":"public boolean com.intellij.database.psi.DbTableImpl.isTemporary()",
        "value":"false"
        },{
        "name":"getDocumentation",
        "desc":"public java.lang.StringBuilder com.intellij.database.psi.DbTableImpl.getDocumentation(boolean)",
        "value":null
        },{
        "name":"getDocumentation",
        "desc":"public java.lang.CharSequence com.intellij.database.psi.DbTableImpl.getDocumentation(boolean)",
        "value":null
        },{
        "name":"getColumnAttrs",
        "desc":"public java.util.Set<com.intellij.database.model.DasColumn$Attribute> com.intellij.database.psi.DbTableImpl.getColumnAttrs(com.intellij.database.model.DasColumn)",
        "value":null
        },{
        "name":"getName",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getName()",
        "value":"company_contact"
        },{
        "name":"getName",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getName(com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"getTypeName",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getTypeName()",
        "value":"table"
        },{
        "name":"getParent",
        "desc":"public com.intellij.database.psi.DbElement com.intellij.database.psi.DbElementImpl.getParent()",
        "value":"mail: schema"
        },{
        "name":"getParent",
        "desc":"public com.intellij.psi.PsiFileSystemItem com.intellij.database.psi.DbElementImpl.getParent()",
        "value":"mail: schema"
        },{
        "name":"getParent",
        "desc":"public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.getParent()",
        "value":"mail: schema"
        },{
        "name":"init",
        "desc":"public void com.intellij.database.psi.DbElementImpl.init(com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"setName",
        "desc":"public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.setName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"getLanguage",
        "desc":"public com.intellij.lang.Language com.intellij.database.psi.DbElementImpl.getLanguage()",
        "value":"Language: SQL"
        },{
        "name":"isDirectory",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.isDirectory()",
        "value":"false"
        },{
        "name":"getText",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getText()",
        "value":"create table company_contact\n(\n    id          int          not null\n        primary key,\n    company_id  int          null,\n    name        varchar(255) null comment '联系人姓名',\n    email       varchar(255) null comment '邮箱地址',\n    position    varchar(255) null comment '职位',\n    phone       varchar(255) null comment '电话',\n    fax         varchar(255) null comment '传真',\n    mobile      varchar(255) null comment '手机',\n    skype       varchar(255) null,\n    whats_app   varchar(255) null,\n    wechat      varchar(255) null,\n    qq          varchar(255) null,\n    remark      varchar(255) null,\n    birthday    datetime     null,\n    user_id     int          null,\n    status      varchar(255) null comment '0 停用， 1 可用',\n    create_date datetime     null,\n    update_date datetime     null\n)\n    charset = utf8mb4;\n\n"
        },{
        "name":"getDeclaration",
        "desc":"public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.getDeclaration()",
        "value":"company_contact: table"
        },{
        "name":"getChildren",
        "desc":"public com.intellij.psi.PsiElement[] com.intellij.database.psi.DbElementImpl.getChildren()",
        "value":"[Lcom.intellij.psi.PsiElement;@30eddf4a"
        },{
        "name":"getPosition",
        "desc":"public short com.intellij.database.psi.DbElementImpl.getPosition()",
        "value":"0"
        },{
        "name":"isWritable",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.isWritable()",
        "value":"true"
        },{
        "name":"isValid",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.isValid()",
        "value":"true"
        },{
        "name":"getComment",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getComment()",
        "value":null
        },{
        "name":"getIcon",
        "desc":"public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon(boolean)",
        "value":null
        },{
        "name":"getIcon",
        "desc":"public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon()",
        "value":"Deferred. Base=RasterizedImageDataLoader(, classLoader=PluginClassLoader[PluginDescriptor(name=Database Tools and SQL, id=com.intellij.database, path=D:\\soft\\path\\IntelliJ IDEA 2020.3\\plugins\\DatabaseTools, version=203.5981.155)] com.intellij.ide.plugins.cl.PluginClassLoader@775dfe9d, path='icons/table.svg')"
        },{
        "name":"getManager",
        "desc":"public com.intellij.psi.PsiManager com.intellij.database.psi.DbElementImpl.getManager()",
        "value":"com.intellij.psi.impl.PsiManagerImpl@17cb832f"
        },{
        "name":"getDelegate",
        "desc":"public D com.intellij.database.psi.DbElementImpl.getDelegate()",
        "value":"company_contact: table"
        },{
        "name":"getWeight",
        "desc":"public int com.intellij.database.psi.DbElementImpl.getWeight()",
        "value":"10000"
        },{
        "name":"getProject",
        "desc":"public com.intellij.openapi.project.Project com.intellij.database.psi.DbElementImpl.getProject()",
        "value":"Project(name=easymail, containerState=COMPONENT_CREATED, componentStore=D:\\soft\\project\\easymail\\easymail.git)"
        },{
        "name":"getVirtualFile",
        "desc":"public com.intellij.openapi.vfs.VirtualFile com.intellij.database.psi.DbElementImpl.getVirtualFile()",
        "value":"DB VirtualFile: table, mail.company_contact [172.26.59.35] (Valid)"
        },{
        "name":"isQuoted",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.isQuoted()",
        "value":"true"
        },{
        "name":"checkSetName",
        "desc":"public void com.intellij.database.psi.DbElementImpl.checkSetName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"navigate",
        "desc":"public void com.intellij.database.psi.DbElementImpl.navigate(boolean,java.lang.String[],com.intellij.util.TriConsumer<com.intellij.database.util.DdlBuilder, java.util.List<com.intellij.database.model.DasColumn>, com.intellij.database.Dbms>)",
        "value":null
        },{
        "name":"navigate",
        "desc":"public void com.intellij.database.psi.DbElementImpl.navigate(boolean,java.lang.String[],boolean,com.intellij.util.TriConsumer<com.intellij.database.util.DdlBuilder, java.util.List<com.intellij.database.model.DasColumn>, com.intellij.database.Dbms>)",
        "value":null
        },{
        "name":"navigate",
        "desc":"public void com.intellij.database.psi.DbElementImpl.navigate(boolean)",
        "value":null
        },{
        "name":"canNavigate",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.canNavigate()",
        "value":null
        },{
        "name":"getKind",
        "desc":"public com.intellij.database.model.ObjectKind com.intellij.database.psi.DbElementImpl.getKind()",
        "value":"table"
        },{
        "name":"getMetaData",
        "desc":"public com.intellij.psi.meta.PsiMetaData com.intellij.database.psi.DbElementImpl.getMetaData()",
        "value":"company_contact: table"
        },{
        "name":"getLocationString",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getLocationString()",
        "value":"mail [172.26.59.35]"
        },{
        "name":"processChildren",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.processChildren(com.intellij.psi.search.PsiElementProcessor<? super com.intellij.psi.PsiFileSystemItem>)",
        "value":null
        },{
        "name":"isCaseSensitive",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.isCaseSensitive()",
        "value":"true"
        },{
        "name":"acceptChildren",
        "desc":"public void com.intellij.database.psi.DbElementImpl.acceptChildren(com.intellij.psi.PsiElementVisitor)",
        "value":null
        },{
        "name":"canNavigateToSource",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.canNavigateToSource()",
        "value":null
        },{
        "name":"processDeclarations",
        "desc":"public final boolean com.intellij.database.psi.DbElementImpl.processDeclarations(com.intellij.database.model.DasScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"getDasChildren",
        "desc":"public com.intellij.util.containers.JBIterable<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.getDasChildren(com.intellij.database.model.ObjectKind)",
        "value":null
        },{
        "name":"getDasParent",
        "desc":"public P com.intellij.database.psi.DbElementImpl.getDasParent()",
        "value":"mail: schema"
        },{
        "name":"getDasParent",
        "desc":"public com.intellij.database.model.DasObject com.intellij.database.psi.DbElementImpl.getDasParent()",
        "value":"mail: schema"
        },{
        "name":"getDbms",
        "desc":"public com.intellij.database.Dbms com.intellij.database.psi.DbElementImpl.getDbms()",
        "value":"MYSQL"
        },{
        "name":"getDataSource",
        "desc":"public com.intellij.database.psi.DbDataSourceImpl com.intellij.database.psi.DbElementImpl.getDataSource()",
        "value":"172.26.59.35: root"
        },{
        "name":"getDataSource",
        "desc":"public com.intellij.database.psi.DbDataSource com.intellij.database.psi.DbElementImpl.getDataSource()",
        "value":"172.26.59.35: root"
        },{
        "name":"getBaseIcon",
        "desc":"public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getBaseIcon()",
        "value":"RasterizedImageDataLoader(, classLoader=PluginClassLoader[PluginDescriptor(name=Database Tools and SQL, id=com.intellij.database, path=D:\\soft\\path\\IntelliJ IDEA 2020.3\\plugins\\DatabaseTools, version=203.5981.155)] com.intellij.ide.plugins.cl.PluginClassLoader@775dfe9d, path='icons/table.svg')"
        },{
        "name":"createDeclarationProcessor",
        "desc":"public com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.createDeclarationProcessor(com.intellij.database.model.DasScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"newDeclarationProcessor",
        "desc":"public static com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.newDeclarationProcessor(com.intellij.database.model.DasScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"getNode",
        "desc":"public com.intellij.lang.ASTNode com.intellij.psi.impl.FakePsiElement.getNode()",
        "value":null
        },{
        "name":"getTextLength",
        "desc":"public int com.intellij.psi.impl.FakePsiElement.getTextLength()",
        "value":"0"
        },{
        "name":"getTextOffset",
        "desc":"public int com.intellij.psi.impl.FakePsiElement.getTextOffset()",
        "value":"0"
        },{
        "name":"getIcon",
        "desc":"public final javax.swing.Icon com.intellij.psi.impl.FakePsiElement.getIcon(int)",
        "value":null
        },{
        "name":"getPresentation",
        "desc":"public com.intellij.navigation.ItemPresentation com.intellij.psi.impl.FakePsiElement.getPresentation()",
        "value":"company_contact: table"
        },{
        "name":"getNextSibling",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getNextSibling()",
        "value":null
        },{
        "name":"getFirstChild",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getFirstChild()",
        "value":null
        },{
        "name":"isPhysical",
        "desc":"public boolean com.intellij.psi.impl.FakePsiElement.isPhysical()",
        "value":"false"
        },{
        "name":"getPrevSibling",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getPrevSibling()",
        "value":null
        },{
        "name":"findElementAt",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.findElementAt(int)",
        "value":null
        },{
        "name":"getLastChild",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getLastChild()",
        "value":null
        },{
        "name":"textContains",
        "desc":"public boolean com.intellij.psi.impl.FakePsiElement.textContains(char)",
        "value":null
        },{
        "name":"getTextRange",
        "desc":"public com.intellij.openapi.util.TextRange com.intellij.psi.impl.FakePsiElement.getTextRange()",
        "value":null
        },{
        "name":"textToCharArray",
        "desc":"public char[] com.intellij.psi.impl.FakePsiElement.textToCharArray()",
        "value":null
        },{
        "name":"getStartOffsetInParent",
        "desc":"public int com.intellij.psi.impl.FakePsiElement.getStartOffsetInParent()",
        "value":"0"
        },{
        "name":"getPresentableText",
        "desc":"public java.lang.String com.intellij.psi.impl.FakePsiElement.getPresentableText()",
        "value":"company_contact"
        },{
        "name":"add",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.add(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"replace",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.replace(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"checkDelete",
        "desc":"public void com.intellij.psi.impl.PsiElementBase.checkDelete() throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"delete",
        "desc":"public void com.intellij.psi.impl.PsiElementBase.delete() throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"accept",
        "desc":"public void com.intellij.psi.impl.PsiElementBase.accept(com.intellij.psi.PsiElementVisitor)",
        "value":null
        },{
        "name":"getContext",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getContext()",
        "value":"mail: schema"
        },{
        "name":"copy",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.copy()",
        "value":null
        },{
        "name":"addRange",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"addAfter",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"addBefore",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"getReference",
        "desc":"public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.getReference()",
        "value":null
        },{
        "name":"findReferenceAt",
        "desc":"public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.findReferenceAt(int)",
        "value":null
        },{
        "name":"getOriginalElement",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getOriginalElement()",
        "value":"company_contact: table"
        },{
        "name":"getReferences",
        "desc":"public com.intellij.psi.PsiReference[] com.intellij.psi.impl.PsiElementBase.getReferences()",
        "value":"[Lcom.intellij.psi.PsiReference;@21881e4d"
        },{
        "name":"textMatches",
        "desc":"public boolean com.intellij.psi.impl.PsiElementBase.textMatches(com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"textMatches",
        "desc":"public boolean com.intellij.psi.impl.PsiElementBase.textMatches(java.lang.CharSequence)",
        "value":null
        },{
        "name":"getContainingFile",
        "desc":"public com.intellij.psi.PsiFile com.intellij.psi.impl.PsiElementBase.getContainingFile()",
        "value":null
        },{
        "name":"addRangeBefore",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"deleteChildRange",
        "desc":"public void com.intellij.psi.impl.PsiElementBase.deleteChildRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"getUseScope",
        "desc":"public com.intellij.psi.search.SearchScope com.intellij.psi.impl.PsiElementBase.getUseScope()",
        "value":"Project and Libraries"
        },{
        "name":"getResolveScope",
        "desc":"public com.intellij.psi.search.GlobalSearchScope com.intellij.psi.impl.PsiElementBase.getResolveScope()",
        "value":"Project and Libraries"
        },{
        "name":"addRangeAfter",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"isEquivalentTo",
        "desc":"public boolean com.intellij.psi.impl.PsiElementBase.isEquivalentTo(com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"checkAdd",
        "desc":"public void com.intellij.psi.impl.PsiElementBase.checkAdd(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"getNavigationElement",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getNavigationElement()",
        "value":"company_contact: table"
        },{
        "name":"processDeclarations",
        "desc":"public boolean com.intellij.psi.impl.PsiElementBase.processDeclarations(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"buildRowIcon",
        "desc":"public static com.intellij.ui.icons.RowIcon com.intellij.psi.impl.ElementBase.buildRowIcon(javax.swing.Icon,javax.swing.Icon)",
        "value":null
        },{
        "name":"isNativeFileType",
        "desc":"public static boolean com.intellij.psi.impl.ElementBase.isNativeFileType(com.intellij.openapi.fileTypes.FileType)",
        "value":null
        },{
        "name":"transformFlags",
        "desc":"public static int com.intellij.psi.impl.ElementBase.transformFlags(com.intellij.psi.PsiElement,int)",
        "value":null
        },{
        "name":"iconWithVisibilityIfNeeded",
        "desc":"public static javax.swing.Icon com.intellij.psi.impl.ElementBase.iconWithVisibilityIfNeeded(int,javax.swing.Icon,javax.swing.Icon)",
        "value":null
        },{
        "name":"replace",
        "desc":"public <T> boolean com.intellij.openapi.util.UserDataHolderBase.replace(com.intellij.openapi.util.Key<T>,T,T)",
        "value":null
        },{
        "name":"putCopyableUserData",
        "desc":"public <T> void com.intellij.openapi.util.UserDataHolderBase.putCopyableUserData(com.intellij.openapi.util.Key<T>,T)",
        "value":null
        },{
        "name":"putUserDataIfAbsent",
        "desc":"public <T> T com.intellij.openapi.util.UserDataHolderBase.putUserDataIfAbsent(com.intellij.openapi.util.Key<T>,T)",
        "value":null
        },{
        "name":"getCopyableUserData",
        "desc":"public <T> T com.intellij.openapi.util.UserDataHolderBase.getCopyableUserData(com.intellij.openapi.util.Key<T>)",
        "value":null
        },{
        "name":"putUserData",
        "desc":"public <T> void com.intellij.openapi.util.UserDataHolderBase.putUserData(com.intellij.openapi.util.Key<T>,T)",
        "value":null
        },{
        "name":"getUserData",
        "desc":"public <T> T com.intellij.openapi.util.UserDataHolderBase.getUserData(com.intellij.openapi.util.Key<T>)",
        "value":null
        },{
        "name":"getUserDataString",
        "desc":"public java.lang.String com.intellij.openapi.util.UserDataHolderBase.getUserDataString()",
        "value":"{COLOR_KEY=com.intellij.database.view.DatabaseColorManager$CachedColor@66f653b5, CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@3c482063}"
        },{
        "name":"isUserDataEmpty",
        "desc":"public boolean com.intellij.openapi.util.UserDataHolderBase.isUserDataEmpty()",
        "value":"false"
        },{
        "name":"copyUserDataTo",
        "desc":"public void com.intellij.openapi.util.UserDataHolderBase.copyUserDataTo(com.intellij.openapi.util.UserDataHolderBase)",
        "value":null
        },{
        "name":"copyCopyableDataTo",
        "desc":"public void com.intellij.openapi.util.UserDataHolderBase.copyCopyableDataTo(com.intellij.openapi.util.UserDataHolderBase)",
        "value":null
        },{
        "name":"getOwnReferences",
        "desc":"public default java.lang.Iterable<? extends com.intellij.model.psi.PsiSymbolReference> com.intellij.psi.PsiElement.getOwnReferences()",
        "value":"[]"
        },{
        "name":"getTextRangeInParent",
        "desc":"public default com.intellij.openapi.util.TextRange com.intellij.psi.PsiElement.getTextRangeInParent()",
        "value":"(0,0)"
        },{
        "name":"getDbChildren",
        "desc":"public default <C> com.intellij.util.containers.JBIterable<C> com.intellij.database.model.DasObject.getDbChildren(java.lang.Class<C>,com.intellij.database.model.ObjectKind)",
        "value":null
        },{
        "name":"getDbParent",
        "desc":"public default com.intellij.database.model.DasObject com.intellij.database.model.DasObject.getDbParent()",
        "value":"mail: schema"
        },{
        "name":"getDependencies",
        "desc":"public default java.lang.Object[] com.intellij.psi.meta.PsiMetaData.getDependencies()",
        "value":"[Ljava.lang.Object;@4b18acb5"
        },{
        "name":"getDependences",
        "desc":"public default java.lang.Object[] com.intellij.psi.meta.PsiMetaData.getDependences()",
        "value":"[Ljava.lang.Object;@4b18acb5"
        },{
        "name":"getPsiDeclarations",
        "desc":"public default com.intellij.util.containers.JBIterable<com.intellij.psi.PsiElement> com.intellij.database.symbols.DasPsiSymbol.getPsiDeclarations()",
        "value":"company_contact: table"
        },{
        "name":"getContextElement",
        "desc":"public default com.intellij.psi.PsiElement com.intellij.database.symbols.DasPsiSymbol.getContextElement()",
        "value":"company_contact: table"
        },{
        "name":"getDasObject",
        "desc":"public default com.intellij.database.model.DasObject com.intellij.database.psi.DbTable.getDasObject()",
        "value":"company_contact: table"
        },{
        "name":"getDasObject",
        "desc":"public default com.intellij.database.model.DasTable com.intellij.database.psi.DbTable.getDasObject()",
        "value":"company_contact: table"
        }],
        "----":"-----------------我是一条华丽的分割线-----------------",
        "fieldList":[{
        "name":"LOG",
        "type":"com.intellij.openapi.diagnostic.Logger",
        "value":"com.intellij.idea.IdeaLogger@64f928b2"
        },{
        "name":"WEIGHT_BASE",
        "type":"int",
        "value":"10000"
        },{
        "name":"WEIGHT_INC",
        "type":"int",
        "value":"1000"
        },{
        "name":"myParent",
        "type":"com.intellij.database.psi.DbElement",
        "value":"mail: schema"
        },{
        "name":"myDelegate",
        "type":"java.lang.Object",
        "value":"company_contact: table"
        },{
        "name":"myTransactionalVersion",
        "type":"long",
        "value":"15"
        },{
        "name":"ASYNC_DOC_CUT",
        "type":"java.lang.String",
        "value":"<!-- async-doc-cut -->"
        },{
        "name":"LOG",
        "type":"com.intellij.openapi.diagnostic.Logger",
        "value":"com.intellij.idea.IdeaLogger@1527e37b"
        },{
        "name":"LOG",
        "type":"com.intellij.openapi.diagnostic.Logger",
        "value":"com.intellij.idea.IdeaLogger@7173a408"
        },{
        "name":"FLAGS_LOCKED",
        "type":"int",
        "value":"2048"
        },{
        "name":"ICON_COMPUTE",
        "type":"java.util.function.Function",
        "value":"com.intellij.psi.impl.ElementBase$$Lambda$1392/0x00000001012ff040@6af7f5ff"
        },{
        "name":"VISIBILITY_ICON_PLACEHOLDER",
        "type":"com.intellij.openapi.util.NotNullLazyValue",
        "value":"com.intellij.openapi.util.NotNullLazyValue$2@47e6ecab"
        },{
        "name":"COPYABLE_USER_MAP_KEY",
        "type":"com.intellij.openapi.util.Key",
        "value":"COPYABLE_USER_MAP_KEY"
        },{
        "name":"myUserMap",
        "type":"com.intellij.util.keyFMap.KeyFMap",
        "value":"{COLOR_KEY=com.intellij.database.view.DatabaseColorManager$CachedColor@66f653b5, CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@3c482063}"
        },{
        "name":"updater",
        "type":"com.intellij.util.concurrency.AtomicFieldUpdater",
        "value":"com.intellij.util.concurrency.AtomicFieldUpdater@6d70e317"
        }]
        }

//调试列原始对象
        {
        "title":"调试：com.intellij.database.psi.DbColumnImpl",
        "methodList":[{
        "name":"getDefault",
        "desc":"public java.lang.String com.intellij.database.psi.DbColumnImpl.getDefault()",
        "value":null
        },{
        "name":"getParent",
        "desc":"public com.intellij.database.psi.DbElement com.intellij.database.psi.DbColumnImpl.getParent()",
        "value":"company_contact: table"
        },{
        "name":"getParent",
        "desc":"public com.intellij.psi.PsiElement com.intellij.database.psi.DbColumnImpl.getParent()",
        "value":"company_contact: table"
        },{
        "name":"getParent",
        "desc":"public com.intellij.database.psi.DbTable com.intellij.database.psi.DbColumnImpl.getParent()",
        "value":"company_contact: table"
        },{
        "name":"getParent",
        "desc":"public com.intellij.psi.PsiFileSystemItem com.intellij.database.psi.DbColumnImpl.getParent()",
        "value":"company_contact: table"
        },{
        "name":"getTable",
        "desc":"public com.intellij.database.psi.DbTable com.intellij.database.psi.DbColumnImpl.getTable()",
        "value":"company_contact: table"
        },{
        "name":"getTable",
        "desc":"public com.intellij.database.model.DasTable com.intellij.database.psi.DbColumnImpl.getTable()",
        "value":"company_contact: table"
        },{
        "name":"getDataType",
        "desc":"public com.intellij.database.model.DataType com.intellij.database.psi.DbColumnImpl.getDataType()",
        "value":"int(11)"
        },{
        "name":"getWeight",
        "desc":"public int com.intellij.database.psi.DbColumnImpl.getWeight()",
        "value":"10030"
        },{
        "name":"isNotNull",
        "desc":"public boolean com.intellij.database.psi.DbColumnImpl.isNotNull()",
        "value":"true"
        },{
        "name":"getDocumentation",
        "desc":"public java.lang.CharSequence com.intellij.database.psi.DbColumnImpl.getDocumentation(boolean)",
        "value":null
        },{
        "name":"getDocumentation",
        "desc":"public java.lang.StringBuilder com.intellij.database.psi.DbColumnImpl.getDocumentation(boolean)",
        "value":null
        },{
        "name":"getName",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getName()",
        "value":"id"
        },{
        "name":"getName",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getName(com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"getTypeName",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getTypeName()",
        "value":"column"
        },{
        "name":"init",
        "desc":"public void com.intellij.database.psi.DbElementImpl.init(com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"setName",
        "desc":"public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.setName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"getLanguage",
        "desc":"public com.intellij.lang.Language com.intellij.database.psi.DbElementImpl.getLanguage()",
        "value":"Language: SQL"
        },{
        "name":"isDirectory",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.isDirectory()",
        "value":"false"
        },{
        "name":"getText",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getText()",
        "value":"alter table company_contact\n    add id int not null;\n\n"
        },{
        "name":"getDeclaration",
        "desc":"public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.getDeclaration()",
        "value":"id: column"
        },{
        "name":"getChildren",
        "desc":"public com.intellij.psi.PsiElement[] com.intellij.database.psi.DbElementImpl.getChildren()",
        "value":"[Lcom.intellij.psi.PsiElement;@30eddf4a"
        },{
        "name":"getPosition",
        "desc":"public short com.intellij.database.psi.DbElementImpl.getPosition()",
        "value":"1"
        },{
        "name":"isWritable",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.isWritable()",
        "value":"true"
        },{
        "name":"isValid",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.isValid()",
        "value":"true"
        },{
        "name":"getComment",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getComment()",
        "value":null
        },{
        "name":"getIcon",
        "desc":"public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon(boolean)",
        "value":null
        },{
        "name":"getIcon",
        "desc":"public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon()",
        "value":"Deferred. Base=RasterizedImageDataLoader(, classLoader=PluginClassLoader[PluginDescriptor(name=Database Tools and SQL, id=com.intellij.database, path=D:\\soft\\path\\IntelliJ IDEA 2020.3\\plugins\\DatabaseTools, version=203.5981.155)] com.intellij.ide.plugins.cl.PluginClassLoader@775dfe9d, path='icons/col.svg')"
        },{
        "name":"getManager",
        "desc":"public com.intellij.psi.PsiManager com.intellij.database.psi.DbElementImpl.getManager()",
        "value":"com.intellij.psi.impl.PsiManagerImpl@17cb832f"
        },{
        "name":"getDelegate",
        "desc":"public D com.intellij.database.psi.DbElementImpl.getDelegate()",
        "value":"id: column"
        },{
        "name":"getProject",
        "desc":"public com.intellij.openapi.project.Project com.intellij.database.psi.DbElementImpl.getProject()",
        "value":"Project(name=easymail, containerState=COMPONENT_CREATED, componentStore=D:\\soft\\project\\easymail\\easymail.git)"
        },{
        "name":"getVirtualFile",
        "desc":"public com.intellij.openapi.vfs.VirtualFile com.intellij.database.psi.DbElementImpl.getVirtualFile()",
        "value":"DB VirtualFile: column, mail.company_contact.id (DDL) [172.26.59.35] (Valid)"
        },{
        "name":"isQuoted",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.isQuoted()",
        "value":"true"
        },{
        "name":"checkSetName",
        "desc":"public void com.intellij.database.psi.DbElementImpl.checkSetName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"navigate",
        "desc":"public void com.intellij.database.psi.DbElementImpl.navigate(boolean,java.lang.String[],com.intellij.util.TriConsumer<com.intellij.database.util.DdlBuilder, java.util.List<com.intellij.database.model.DasColumn>, com.intellij.database.Dbms>)",
        "value":null
        },{
        "name":"navigate",
        "desc":"public void com.intellij.database.psi.DbElementImpl.navigate(boolean,java.lang.String[],boolean,com.intellij.util.TriConsumer<com.intellij.database.util.DdlBuilder, java.util.List<com.intellij.database.model.DasColumn>, com.intellij.database.Dbms>)",
        "value":null
        },{
        "name":"navigate",
        "desc":"public void com.intellij.database.psi.DbElementImpl.navigate(boolean)",
        "value":null
        },{
        "name":"canNavigate",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.canNavigate()",
        "value":null
        },{
        "name":"getKind",
        "desc":"public com.intellij.database.model.ObjectKind com.intellij.database.psi.DbElementImpl.getKind()",
        "value":"column"
        },{
        "name":"getMetaData",
        "desc":"public com.intellij.psi.meta.PsiMetaData com.intellij.database.psi.DbElementImpl.getMetaData()",
        "value":"id: column"
        },{
        "name":"getLocationString",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getLocationString()",
        "value":"mail.company_contact [172.26.59.35]"
        },{
        "name":"processChildren",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.processChildren(com.intellij.psi.search.PsiElementProcessor<? super com.intellij.psi.PsiFileSystemItem>)",
        "value":null
        },{
        "name":"isCaseSensitive",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.isCaseSensitive()",
        "value":"false"
        },{
        "name":"acceptChildren",
        "desc":"public void com.intellij.database.psi.DbElementImpl.acceptChildren(com.intellij.psi.PsiElementVisitor)",
        "value":null
        },{
        "name":"canNavigateToSource",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.canNavigateToSource()",
        "value":null
        },{
        "name":"processDeclarations",
        "desc":"public final boolean com.intellij.database.psi.DbElementImpl.processDeclarations(com.intellij.database.model.DasScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"getDasChildren",
        "desc":"public com.intellij.util.containers.JBIterable<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.getDasChildren(com.intellij.database.model.ObjectKind)",
        "value":null
        },{
        "name":"getDasParent",
        "desc":"public P com.intellij.database.psi.DbElementImpl.getDasParent()",
        "value":"company_contact: table"
        },{
        "name":"getDasParent",
        "desc":"public com.intellij.database.model.DasObject com.intellij.database.psi.DbElementImpl.getDasParent()",
        "value":"company_contact: table"
        },{
        "name":"getDbms",
        "desc":"public com.intellij.database.Dbms com.intellij.database.psi.DbElementImpl.getDbms()",
        "value":"MYSQL"
        },{
        "name":"getDataSource",
        "desc":"public com.intellij.database.psi.DbDataSourceImpl com.intellij.database.psi.DbElementImpl.getDataSource()",
        "value":"172.26.59.35: root"
        },{
        "name":"getDataSource",
        "desc":"public com.intellij.database.psi.DbDataSource com.intellij.database.psi.DbElementImpl.getDataSource()",
        "value":"172.26.59.35: root"
        },{
        "name":"getBaseIcon",
        "desc":"public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getBaseIcon()",
        "value":"RasterizedImageDataLoader(, classLoader=PluginClassLoader[PluginDescriptor(name=Database Tools and SQL, id=com.intellij.database, path=D:\\soft\\path\\IntelliJ IDEA 2020.3\\plugins\\DatabaseTools, version=203.5981.155)] com.intellij.ide.plugins.cl.PluginClassLoader@775dfe9d, path='icons/col.svg')"
        },{
        "name":"createDeclarationProcessor",
        "desc":"public com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.createDeclarationProcessor(com.intellij.database.model.DasScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"newDeclarationProcessor",
        "desc":"public static com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.newDeclarationProcessor(com.intellij.database.model.DasScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"getNode",
        "desc":"public com.intellij.lang.ASTNode com.intellij.psi.impl.FakePsiElement.getNode()",
        "value":null
        },{
        "name":"getTextLength",
        "desc":"public int com.intellij.psi.impl.FakePsiElement.getTextLength()",
        "value":"0"
        },{
        "name":"getTextOffset",
        "desc":"public int com.intellij.psi.impl.FakePsiElement.getTextOffset()",
        "value":"0"
        },{
        "name":"getIcon",
        "desc":"public final javax.swing.Icon com.intellij.psi.impl.FakePsiElement.getIcon(int)",
        "value":null
        },{
        "name":"getPresentation",
        "desc":"public com.intellij.navigation.ItemPresentation com.intellij.psi.impl.FakePsiElement.getPresentation()",
        "value":"id: column"
        },{
        "name":"getNextSibling",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getNextSibling()",
        "value":null
        },{
        "name":"getFirstChild",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getFirstChild()",
        "value":null
        },{
        "name":"isPhysical",
        "desc":"public boolean com.intellij.psi.impl.FakePsiElement.isPhysical()",
        "value":"false"
        },{
        "name":"getPrevSibling",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getPrevSibling()",
        "value":null
        },{
        "name":"findElementAt",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.findElementAt(int)",
        "value":null
        },{
        "name":"getLastChild",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getLastChild()",
        "value":null
        },{
        "name":"textContains",
        "desc":"public boolean com.intellij.psi.impl.FakePsiElement.textContains(char)",
        "value":null
        },{
        "name":"getTextRange",
        "desc":"public com.intellij.openapi.util.TextRange com.intellij.psi.impl.FakePsiElement.getTextRange()",
        "value":null
        },{
        "name":"textToCharArray",
        "desc":"public char[] com.intellij.psi.impl.FakePsiElement.textToCharArray()",
        "value":null
        },{
        "name":"getStartOffsetInParent",
        "desc":"public int com.intellij.psi.impl.FakePsiElement.getStartOffsetInParent()",
        "value":"0"
        },{
        "name":"getPresentableText",
        "desc":"public java.lang.String com.intellij.psi.impl.FakePsiElement.getPresentableText()",
        "value":"id"
        },{
        "name":"add",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.add(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"replace",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.replace(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"checkDelete",
        "desc":"public void com.intellij.psi.impl.PsiElementBase.checkDelete() throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"delete",
        "desc":"public void com.intellij.psi.impl.PsiElementBase.delete() throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"accept",
        "desc":"public void com.intellij.psi.impl.PsiElementBase.accept(com.intellij.psi.PsiElementVisitor)",
        "value":null
        },{
        "name":"getContext",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getContext()",
        "value":"company_contact: table"
        },{
        "name":"copy",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.copy()",
        "value":null
        },{
        "name":"addRange",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"addAfter",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"addBefore",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"getReference",
        "desc":"public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.getReference()",
        "value":null
        },{
        "name":"findReferenceAt",
        "desc":"public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.findReferenceAt(int)",
        "value":null
        },{
        "name":"getOriginalElement",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getOriginalElement()",
        "value":"id: column"
        },{
        "name":"getReferences",
        "desc":"public com.intellij.psi.PsiReference[] com.intellij.psi.impl.PsiElementBase.getReferences()",
        "value":"[Lcom.intellij.psi.PsiReference;@21881e4d"
        },{
        "name":"textMatches",
        "desc":"public boolean com.intellij.psi.impl.PsiElementBase.textMatches(com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"textMatches",
        "desc":"public boolean com.intellij.psi.impl.PsiElementBase.textMatches(java.lang.CharSequence)",
        "value":null
        },{
        "name":"getContainingFile",
        "desc":"public com.intellij.psi.PsiFile com.intellij.psi.impl.PsiElementBase.getContainingFile()",
        "value":null
        },{
        "name":"addRangeBefore",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"deleteChildRange",
        "desc":"public void com.intellij.psi.impl.PsiElementBase.deleteChildRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"getUseScope",
        "desc":"public com.intellij.psi.search.SearchScope com.intellij.psi.impl.PsiElementBase.getUseScope()",
        "value":"Project and Libraries"
        },{
        "name":"getResolveScope",
        "desc":"public com.intellij.psi.search.GlobalSearchScope com.intellij.psi.impl.PsiElementBase.getResolveScope()",
        "value":"Project and Libraries"
        },{
        "name":"addRangeAfter",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"isEquivalentTo",
        "desc":"public boolean com.intellij.psi.impl.PsiElementBase.isEquivalentTo(com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"checkAdd",
        "desc":"public void com.intellij.psi.impl.PsiElementBase.checkAdd(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"getNavigationElement",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getNavigationElement()",
        "value":"id: column"
        },{
        "name":"processDeclarations",
        "desc":"public boolean com.intellij.psi.impl.PsiElementBase.processDeclarations(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"buildRowIcon",
        "desc":"public static com.intellij.ui.icons.RowIcon com.intellij.psi.impl.ElementBase.buildRowIcon(javax.swing.Icon,javax.swing.Icon)",
        "value":null
        },{
        "name":"isNativeFileType",
        "desc":"public static boolean com.intellij.psi.impl.ElementBase.isNativeFileType(com.intellij.openapi.fileTypes.FileType)",
        "value":null
        },{
        "name":"transformFlags",
        "desc":"public static int com.intellij.psi.impl.ElementBase.transformFlags(com.intellij.psi.PsiElement,int)",
        "value":null
        },{
        "name":"iconWithVisibilityIfNeeded",
        "desc":"public static javax.swing.Icon com.intellij.psi.impl.ElementBase.iconWithVisibilityIfNeeded(int,javax.swing.Icon,javax.swing.Icon)",
        "value":null
        },{
        "name":"replace",
        "desc":"public <T> boolean com.intellij.openapi.util.UserDataHolderBase.replace(com.intellij.openapi.util.Key<T>,T,T)",
        "value":null
        },{
        "name":"putCopyableUserData",
        "desc":"public <T> void com.intellij.openapi.util.UserDataHolderBase.putCopyableUserData(com.intellij.openapi.util.Key<T>,T)",
        "value":null
        },{
        "name":"putUserDataIfAbsent",
        "desc":"public <T> T com.intellij.openapi.util.UserDataHolderBase.putUserDataIfAbsent(com.intellij.openapi.util.Key<T>,T)",
        "value":null
        },{
        "name":"getCopyableUserData",
        "desc":"public <T> T com.intellij.openapi.util.UserDataHolderBase.getCopyableUserData(com.intellij.openapi.util.Key<T>)",
        "value":null
        },{
        "name":"putUserData",
        "desc":"public <T> void com.intellij.openapi.util.UserDataHolderBase.putUserData(com.intellij.openapi.util.Key<T>,T)",
        "value":null
        },{
        "name":"getUserData",
        "desc":"public <T> T com.intellij.openapi.util.UserDataHolderBase.getUserData(com.intellij.openapi.util.Key<T>)",
        "value":null
        },{
        "name":"getUserDataString",
        "desc":"public java.lang.String com.intellij.openapi.util.UserDataHolderBase.getUserDataString()",
        "value":"{CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@5980e0aa}"
        },{
        "name":"isUserDataEmpty",
        "desc":"public boolean com.intellij.openapi.util.UserDataHolderBase.isUserDataEmpty()",
        "value":"false"
        },{
        "name":"copyUserDataTo",
        "desc":"public void com.intellij.openapi.util.UserDataHolderBase.copyUserDataTo(com.intellij.openapi.util.UserDataHolderBase)",
        "value":null
        },{
        "name":"copyCopyableDataTo",
        "desc":"public void com.intellij.openapi.util.UserDataHolderBase.copyCopyableDataTo(com.intellij.openapi.util.UserDataHolderBase)",
        "value":null
        },{
        "name":"getOwnReferences",
        "desc":"public default java.lang.Iterable<? extends com.intellij.model.psi.PsiSymbolReference> com.intellij.psi.PsiElement.getOwnReferences()",
        "value":"[]"
        },{
        "name":"getTextRangeInParent",
        "desc":"public default com.intellij.openapi.util.TextRange com.intellij.psi.PsiElement.getTextRangeInParent()",
        "value":"(0,0)"
        },{
        "name":"getDbChildren",
        "desc":"public default <C> com.intellij.util.containers.JBIterable<C> com.intellij.database.model.DasObject.getDbChildren(java.lang.Class<C>,com.intellij.database.model.ObjectKind)",
        "value":null
        },{
        "name":"getDbParent",
        "desc":"public default com.intellij.database.model.DasObject com.intellij.database.model.DasObject.getDbParent()",
        "value":"company_contact: table"
        },{
        "name":"getDependencies",
        "desc":"public default java.lang.Object[] com.intellij.psi.meta.PsiMetaData.getDependencies()",
        "value":"[Ljava.lang.Object;@4b18acb5"
        },{
        "name":"getDependences",
        "desc":"public default java.lang.Object[] com.intellij.psi.meta.PsiMetaData.getDependences()",
        "value":"[Ljava.lang.Object;@4b18acb5"
        },{
        "name":"getPsiDeclarations",
        "desc":"public default com.intellij.util.containers.JBIterable<com.intellij.psi.PsiElement> com.intellij.database.symbols.DasPsiSymbol.getPsiDeclarations()",
        "value":"id: column"
        },{
        "name":"getContextElement",
        "desc":"public default com.intellij.psi.PsiElement com.intellij.database.symbols.DasPsiSymbol.getContextElement()",
        "value":"id: column"
        },{
        "name":"getDasObject",
        "desc":"public default com.intellij.database.model.DasObject com.intellij.database.psi.DbColumn.getDasObject()",
        "value":"id: column"
        },{
        "name":"getDasObject",
        "desc":"public default com.intellij.database.model.DasColumn com.intellij.database.psi.DbColumn.getDasObject()",
        "value":"id: column"
        },{
        "name":"getTableName",
        "desc":"public default java.lang.String com.intellij.database.model.DasColumn.getTableName()",
        "value":"company_contact"
        }],
        "----":"-----------------我是一条华丽的分割线-----------------",
        "fieldList":[{
        "name":"LOG",
        "type":"com.intellij.openapi.diagnostic.Logger",
        "value":"com.intellij.idea.IdeaLogger@64f928b2"
        },{
        "name":"WEIGHT_BASE",
        "type":"int",
        "value":"10000"
        },{
        "name":"WEIGHT_INC",
        "type":"int",
        "value":"1000"
        },{
        "name":"myParent",
        "type":"com.intellij.database.psi.DbElement",
        "value":"company_contact: table"
        },{
        "name":"myDelegate",
        "type":"java.lang.Object",
        "value":"id: column"
        },{
        "name":"myTransactionalVersion",
        "type":"long",
        "value":"15"
        },{
        "name":"ASYNC_DOC_CUT",
        "type":"java.lang.String",
        "value":"<!-- async-doc-cut -->"
        },{
        "name":"LOG",
        "type":"com.intellij.openapi.diagnostic.Logger",
        "value":"com.intellij.idea.IdeaLogger@1527e37b"
        },{
        "name":"LOG",
        "type":"com.intellij.openapi.diagnostic.Logger",
        "value":"com.intellij.idea.IdeaLogger@7173a408"
        },{
        "name":"FLAGS_LOCKED",
        "type":"int",
        "value":"2048"
        },{
        "name":"ICON_COMPUTE",
        "type":"java.util.function.Function",
        "value":"com.intellij.psi.impl.ElementBase$$Lambda$1392/0x00000001012ff040@6af7f5ff"
        },{
        "name":"VISIBILITY_ICON_PLACEHOLDER",
        "type":"com.intellij.openapi.util.NotNullLazyValue",
        "value":"com.intellij.openapi.util.NotNullLazyValue$2@47e6ecab"
        },{
        "name":"COPYABLE_USER_MAP_KEY",
        "type":"com.intellij.openapi.util.Key",
        "value":"COPYABLE_USER_MAP_KEY"
        },{
        "name":"myUserMap",
        "type":"com.intellij.util.keyFMap.KeyFMap",
        "value":"{CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@5980e0aa}"
        },{
        "name":"updater",
        "type":"com.intellij.util.concurrency.AtomicFieldUpdater",
        "value":"com.intellij.util.concurrency.AtomicFieldUpdater@6d70e317"
        }]
        }

//调试列原始列类型
        {
        "title":"调试：com.intellij.database.model.DataType",
        "methodList":[{
        "name":"getLength",
        "desc":"public int com.intellij.database.model.DataType.getLength()",
        "value":"11"
        },{
        "name":"getScale",
        "desc":"public int com.intellij.database.model.DataType.getScale()",
        "value":"0"
        },{
        "name":"getPrecision",
        "desc":"public int com.intellij.database.model.DataType.getPrecision()",
        "value":"11"
        },{
        "name":"getSpecification",
        "desc":"public java.lang.String com.intellij.database.model.DataType.getSpecification(boolean,boolean)",
        "value":null
        },{
        "name":"getSpecification",
        "desc":"public java.lang.String com.intellij.database.model.DataType.getSpecification()",
        "value":"int(11)"
        },{
        "name":"withTypeName",
        "desc":"public com.intellij.database.model.DataType com.intellij.database.model.DataType.withTypeName(java.lang.String)",
        "value":null
        },{
        "name":"equalsWithoutJdbc",
        "desc":"public boolean com.intellij.database.model.DataType.equalsWithoutJdbc(com.intellij.database.model.DataType)",
        "value":null
        }],
        "----":"-----------------我是一条华丽的分割线-----------------",
        "fieldList":[{
        "name":"MAX_SIZE",
        "type":"int",
        "value":"2147483647"
        },{
        "name":"STAR_SIZE",
        "type":"int",
        "value":"2147483646"
        },{
        "name":"NO_SIZE",
        "type":"int",
        "value":"-1"
        },{
        "name":"NO_SCALE",
        "type":"int",
        "value":"0"
        },{
        "name":"UNKNOWN",
        "type":"com.intellij.database.model.DataType",
        "value":"unknown"
        },{
        "name":"schemaName",
        "type":"java.lang.String",
        "value":null
        },{
        "name":"packageName",
        "type":"java.lang.String",
        "value":null
        },{
        "name":"typeName",
        "type":"java.lang.String",
        "value":"int"
        },{
        "name":"size",
        "type":"int",
        "value":"11"
        },{
        "name":"scale",
        "type":"int",
        "value":"0"
        },{
        "name":"sizeUnit",
        "type":"com.intellij.database.model.LengthUnit",
        "value":"com.intellij.database.model.LengthUnit@162f5589"
        },{
        "name":"vagueArg",
        "type":"java.lang.String",
        "value":null
        },{
        "name":"suffix",
        "type":"java.lang.String",
        "value":null
        },{
        "name":"sizeUnitExplicit",
        "type":"boolean",
        "value":"false"
        },{
        "name":"custom",
        "type":"boolean",
        "value":"false"
        },{
        "name":"enumValues",
        "type":"java.util.List",
        "value":null
        },{
        "name":"jdbcType",
        "type":"int",
        "value":"0"
        }]
        }

//获取原始列类型中的字段
        sqlType=int

//执行原始列类型中的方法
        sqlTypeLen=11

