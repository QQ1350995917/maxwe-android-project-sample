# keytool -genkey -alias maxwe-android-project-sample -keyalg RSA -validity 40000 -keystore maxwe-android-project-sample.jks
# 说明：
# -genkey 产生密钥
# -alias mykey 别名 maxwe-android-project-sample
# -keyalg RSA 使用RSA算法对签名加密
# -validity 40000 有效期限4000天
# -keystore 文件名称 maxwe-android-project-sample.jks
# sh GenKey.sh
# What is your first and last name?
#  [Unknown]:  maxwe-android-project-sample
# What is the name of your organizational unit?
#  [Unknown]:  maxwe-android-project-sample
# What is the name of your organization?
#  [Unknown]:  maxwe-android-project-sample
# What is the name of your City or Locality?
#  [Unknown]:  maxwe-android-project-sample
# What is the name of your State or Province?
#  [Unknown]:  maxwe-android-project-sample
# What is the two-letter country code for this unit?
#  [Unknown]:  86
# Is CN=maxwe-android-project-sample, OU=maxwe-android-project-sample, O=maxwe-android-project-sample, L=maxwe-android-project-sample, ST=maxwe-android-project-sample, C=86 correct?
#  [no]:  yes

keytool -genkey \
        -alias maxwe-android-project-sample \
        -keyalg RSA \
        -validity 40000 \
        -keypass maxwe-android-project-sample \
        -keystore maxwe-android-project-sample.jks \
        -storepass maxwe-android-project-sample


