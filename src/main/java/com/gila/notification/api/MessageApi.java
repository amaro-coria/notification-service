/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.gila.notification.api;

import com.gila.notification.api.model.AddMessageRequest;
import com.gila.notification.api.model.AddMessageResponse;
import com.gila.notification.api.model.LogMessageResponse;
import jakarta.validation.Valid;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-20T00:23:35.182632-06:00[America/Mexico_City]")
@Validated
@Tag(name = "api", description = "the api API")
public interface MessageApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /api/v1/message : Registers a message to be sent
     * Put a message to be sent by all the channels requested
     *
     * @param addMessageRequest Creates a new message sending request (required)
     * @return Successful operation (status code 200)
     */
    @Operation(
        operationId = "addMessage",
        summary = "Registers a message to be sent",
        tags = { "message" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AddMessageResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/v1/message",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<AddMessageResponse> addMessage(
        @Parameter(name = "AddMessageRequest", description = "Creates a new message sending request", required = true) @Valid @RequestBody AddMessageRequest addMessageRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : { \"createdTime\" : \"2021-01-30T08:30:00Z\", \"id\" : 1001, \"userAuthor\" : \"jhondoe314\", \"messageContent\" : \"140 character content\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/message : Retrieves all messages
     * Gets all message registered on the platform ordered by creation date
     *
     * @return Successful operation (status code 200)
     */
    @Operation(
        operationId = "getMessages",
        summary = "Retrieves all messages",
        tags = { "message", "log" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = LogMessageResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/message",
        produces = { "application/json" }
    )
    default ResponseEntity<LogMessageResponse> getMessages(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"messages\" : [ { \"createdTime\" : \"2021-01-30T08:30:00Z\", \"id\" : 1001, \"userAuthor\" : \"jhondoe314\", \"messageContent\" : \"140 character content\" }, { \"createdTime\" : \"2021-01-30T08:30:00Z\", \"id\" : 1001, \"userAuthor\" : \"jhondoe314\", \"messageContent\" : \"140 character content\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
