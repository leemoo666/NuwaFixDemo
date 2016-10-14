# NuwaFixDemo

//步骤一:
//增加依赖和插件

//compile 'cn.jiajixin.nuwa:nuwa:1.0.0'
//        }
//        apply plugin: "cn.jiajixin.nuwa"

//步骤二:
//在项目的build.gradle中增加如下代码

//classpath 'com.android.tools.build:gradle:1.2.3'
//        classpath 'cn.jiajixin.nuwa:gradle:1.2.2'

//步骤三:
//降低gradle版本
//distributionUrl=https\://services.gradle.org/distributions/gradle-2.8-all.zip


//步骤四:
//取消支持instant run
//在preference->build,exception->取消使能instant run

//步骤五:
//编写BugClass文件 return "there is a BUG!!!";

//步骤六:
//运行并安装apk，会在app/build/outputs/目录下自动生成一个叫nuwa的目录：

//步骤七:
//将nuwa/ 拷贝到/Users/lixiaoming/demo2/NuwaDemo/ 目录下

//步骤八:
////编写BugClass文件 return "OK!!!";

//步骤九:
//运行并安装apk

//步骤十:
//在命令窗口中输入#./gradlew clean nuwaDebugPatch -P NuwaDir=/Users/lixiaoming/demo2/NuwaDemo/nuwa  会在
//app/build/outputs/nuwa/debug/目录下会自动生成patch.jar文件

//步骤十一:
//adb install /Users/lixiaoming/demo2/NuwaDemo/nuwa/bug.apk
//将有bug的apk安装到手机,运行会打印"there is a BUG!!!"

//步骤十二:
//将补丁文件拷贝到SD卡中
//adb push /Users/lixiaoming/demo2/NuwaDemo/app/build/outputs/nuwa/debug/patch.jar /sdcard/

//步骤十三:
//杀死程序,重新运行----在魅族上不起作用
