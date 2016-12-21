/**
 * 
 */
package com.bs.genericjson.convertor;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Convert JSON to java object
 * 
 * @author Shailendra Soni
 *
 */
public class JsonToObject<T extends JsonPojoParserInt> {

    /**
     * Generic method for convert JSON response to POJO, make sure POJO should implement {@link JsonPojoParserInt}
     * 
     * @param jsonString
     * @param jsonRootNode
     * @param classzz
     * @return
     * @throws JsonGenerationException
     * @throws JsonMappingException
     * @throws IOException
     */
    public T readJSONResponse(String jsonString, String jsonRootNode, Class<T> classzz)
            throws JsonGenerationException, JsonMappingException, IOException {

        ObjectMapper objMapper = new ObjectMapper();
        JsonNode jsonNode = objMapper.readTree(jsonString);
        objMapper.configure(MapperFeature.AUTO_DETECT_FIELDS, true);
        objMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objMapper.readValue(jsonNode.path(jsonRootNode).traverse(), classzz);
    }

}
