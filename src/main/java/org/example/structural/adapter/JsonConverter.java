package org.example.structural.adapter;

import java.lang.reflect.Field;

public class JsonConverter {
    public static String convertToJson(Object object) throws IllegalAccessException {
        StringBuilder jsonBuilder = new StringBuilder();
        if (object.getClass().isArray()) {
            appendArrayToJson(jsonBuilder, object);
        }
        else {
            jsonBuilder.append("{");
            appendObjectToJson(jsonBuilder, object);
            jsonBuilder.append("}");
        }
        return jsonBuilder.toString();
    }

    private static void appendFieldValueToJson(StringBuilder jsonBuilder, Object fieldValue) throws IllegalAccessException {
        if (fieldValue == null) {
            jsonBuilder.append("null");
        } else if (fieldValue instanceof String) {
            jsonBuilder.append("\"").append(fieldValue).append("\"");
        } else if (fieldValue instanceof Number || fieldValue instanceof Boolean) {
            jsonBuilder.append(fieldValue);
        } else if (fieldValue.getClass().isArray()) {
            appendArrayToJson(jsonBuilder, fieldValue);
        } else {
            appendObjectToJson(jsonBuilder, fieldValue);
        }
    }

    private static void appendArrayToJson(StringBuilder jsonBuilder, Object array) throws IllegalAccessException {
        jsonBuilder.append("[");
        int length = java.lang.reflect.Array.getLength(array);
        for (int i = 0; i < length; i++) {
            Object arrayElement = java.lang.reflect.Array.get(array, i);
            appendFieldValueToJson(jsonBuilder, arrayElement);
            if (i < length - 1) {
                jsonBuilder.append(",");
            }
        }
        jsonBuilder.append("]");
    }

    private static void appendObjectToJson(StringBuilder jsonBuilder, Object object) throws IllegalAccessException {
        jsonBuilder.append("{");
        Field[] fields = object.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            String fieldName = fields[i].getName();
            Object fieldValue = fields[i].get(object);
            jsonBuilder.append("\"").append(fieldName).append("\":");
            appendFieldValueToJson(jsonBuilder, fieldValue);
            if (i < fields.length - 1) {
                jsonBuilder.append(",");
            }
        }
        jsonBuilder.append("}");
    }
}
