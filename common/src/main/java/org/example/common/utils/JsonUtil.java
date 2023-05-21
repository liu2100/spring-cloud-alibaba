package org.example.common.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

public class JsonUtil {

    public static ObjectMapper objectMapper = new ObjectMapper();

    /**
     * 对象转JSON字符串
     * @param obj 对象值
     * @return JSON
     */
    public static String objectToJson(Object obj) {
        String result = "";
        try {
            result = objectMapper.writeValueAsString(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * JSON转对象
     * @param str JSON字符串
     * @param clazz 类
     * @return T
     */
    public static <T> T jsonToObject(String str, Class<T> clazz){
        if (clazz == null){
            return null;
        }
        try {
            return objectMapper.readValue(str, clazz);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * JSON转对象
     * @param str JSON字符串
     * @param valueTypeRef 类
     * @return T
     */
    public static <T> T jsonToObject(String str, TypeReference<T> valueTypeRef){
        if (valueTypeRef == null) {
            return null;
        }
        try {
            return objectMapper.readValue(str, valueTypeRef);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 对象转实体
     * @param obj 对象
     * @param tClass 实体
     * @return T
     */
    public static <T> T objToEntity(Object obj, Class<T> tClass) {
        try {
            return objectMapper.convertValue(obj, tClass);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 对象转MAP
     * @param obj 对象值
     * @return Map
     */
    public static Map<?, ?> objectToMap(Object obj) {
        String json = objectToJson(obj);
        return jsonToObject(json, Map.class);
    }

}

