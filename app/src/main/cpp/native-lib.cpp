#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_r4hu1_fridaplayground_HookMe_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "FP{test_flag}";
    return env->NewStringUTF(hello.c_str());
}

extern "C" JNIEXPORT jint JNICALL
Java_com_r4hu1_fridaplayground_HookMeInteger_integerFromJNI(
                JNIEnv *env,
                jobject) {
        std::int8_t  num = 15;
        return num;

}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_r4hu1_fridaplayground_HookMeInteger_stringFromJNI(JNIEnv *env, jobject thiz) {

        std::string hello = "FP{test_flag}";
        return env->NewStringUTF(hello.c_str());}

extern "C"
JNIEXPORT jstring JNICALL
    Java_com_r4hu1_fridaplayground_HookMeString_stringargs(JNIEnv *env, jobject thiz) {

            std::string proxy = "Random_String";
    return  env->NewStringUTF(proxy.c_str());
        }

extern "C" JNIEXPORT jstring JNICALL
Java_com_r4hu1_fridaplayground_HookMeString_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "FP{test_flag}";
    return env->NewStringUTF(hello.c_str());
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_r4hu1_fridaplayground_OverloadedFunc_stringargs(JNIEnv *env, jobject thiz) {
    std::string proxy = "Random_String";
    return  env->NewStringUTF(proxy.c_str());
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_r4hu1_fridaplayground_OverloadedFunc_stringFromJNI(JNIEnv *env, jobject thiz) {
    std::string hello = "FP{test_flag}";
    return env->NewStringUTF(hello.c_str());
}

    extern "C"
    JNIEXPORT jstring JNICALL
    Java_com_r4hu1_fridaplayground_HookMeVariable_stringFromJNI(JNIEnv *env, jobject thiz) {

        std::string hello = "FP{test_flag}";
        return env->NewStringUTF(hello.c_str());

    }