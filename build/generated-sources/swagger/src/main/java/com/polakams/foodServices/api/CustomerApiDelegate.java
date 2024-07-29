package com.polakams.foodServices.api;

import com.polakams.foodServices.api.model.Customer;
import com.polakams.foodServices.api.model.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

/**
 * A delegate to be called by the {@link CustomerApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface CustomerApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /customers : Create a new customer
     * Create a new customer and customer details
     *
     * @param customer  (required)
     * @return Customer created successfully (status code 201)
     *         or Invalid input (status code 400)
     * @see CustomerApi#createCustomer
     */
    default ResponseEntity<Customer> createCustomer(Customer customer) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"defaultGeoLocationId\" : \"defaultGeoLocationId\", \"contact\" : { \"zip\" : \"zip\", \"phone\" : \"phone\", \"city\" : \"city\", \"street\" : \"street\", \"state\" : \"state\", \"email\" : \"email\" }, \"name\" : \"name\", \"id\" : \"id\", \"localityId\" : \"localityId\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /customers/{id} : Delete a customer
     * Deletes a customer by ID
     *
     * @param id The ID of the customer (required)
     * @return Customer deleted successfully (status code 204)
     *         or Invalid input (status code 400)
     *         or Resource not found (status code 404)
     * @see CustomerApi#deleteCustomer
     */
    default ResponseEntity<Void> deleteCustomer(String id) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /customers/{id} : Get customer details
     * Returns a single customer with all details
     *
     * @param id The ID of the customer (required)
     * @return successful operation (status code 200)
     *         or Invalid input (status code 400)
     *         or Resource not found (status code 404)
     * @see CustomerApi#getCustomerById
     */
    default ResponseEntity<Customer> getCustomerById(String id) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"defaultGeoLocationId\" : \"defaultGeoLocationId\", \"contact\" : { \"zip\" : \"zip\", \"phone\" : \"phone\", \"city\" : \"city\", \"street\" : \"street\", \"state\" : \"state\", \"email\" : \"email\" }, \"name\" : \"name\", \"id\" : \"id\", \"localityId\" : \"localityId\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /customers/{id}/orders : Get all orders for a customer
     * Returns all orders for the specified customer
     *
     * @param id The ID of the customer (required)
     * @return successful operation (status code 200)
     *         or Invalid input (status code 400)
     *         or Resource not found (status code 404)
     * @see CustomerApi#getCustomerOrders
     */
    default ResponseEntity<List<Order>> getCustomerOrders(String id) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"agentId\" : \"agentId\", \"amount\" : 0.8008281904610115, \"updatedBy\" : \"updatedBy\", \"orderId\" : \"orderId\", \"customerId\" : \"customerId\", \"localityId\" : \"localityId\", \"items\" : [ \"items\", \"items\" ], \"updatedTimestamp\" : \"updatedTimestamp\", \"status\" : \"status\" }, { \"agentId\" : \"agentId\", \"amount\" : 0.8008281904610115, \"updatedBy\" : \"updatedBy\", \"orderId\" : \"orderId\", \"customerId\" : \"customerId\", \"localityId\" : \"localityId\", \"items\" : [ \"items\", \"items\" ], \"updatedTimestamp\" : \"updatedTimestamp\", \"status\" : \"status\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /customers : Get all customers in a locality
     * Returns all customers in the given locality
     *
     * @param localityId The ID of the locality (required)
     * @return successful operation (status code 200)
     *         or Invalid input (status code 400)
     * @see CustomerApi#getCustomersByLocality
     */
    default ResponseEntity<List<Customer>> getCustomersByLocality(String localityId) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"defaultGeoLocationId\" : \"defaultGeoLocationId\", \"contact\" : { \"zip\" : \"zip\", \"phone\" : \"phone\", \"city\" : \"city\", \"street\" : \"street\", \"state\" : \"state\", \"email\" : \"email\" }, \"name\" : \"name\", \"id\" : \"id\", \"localityId\" : \"localityId\" }, { \"defaultGeoLocationId\" : \"defaultGeoLocationId\", \"contact\" : { \"zip\" : \"zip\", \"phone\" : \"phone\", \"city\" : \"city\", \"street\" : \"street\", \"state\" : \"state\", \"email\" : \"email\" }, \"name\" : \"name\", \"id\" : \"id\", \"localityId\" : \"localityId\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PATCH /customers/{id} : Partially update an existing customer
     * Partially update an existing customer and customer details
     *
     * @param id The ID of the customer (required)
     * @param customer  (required)
     * @return Customer updated successfully (status code 200)
     *         or Invalid input (status code 400)
     *         or Resource not found (status code 404)
     * @see CustomerApi#patchCustomer
     */
    default ResponseEntity<Customer> patchCustomer(String id,
        Customer customer) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"defaultGeoLocationId\" : \"defaultGeoLocationId\", \"contact\" : { \"zip\" : \"zip\", \"phone\" : \"phone\", \"city\" : \"city\", \"street\" : \"street\", \"state\" : \"state\", \"email\" : \"email\" }, \"name\" : \"name\", \"id\" : \"id\", \"localityId\" : \"localityId\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /customers/{id} : Update an existing customer
     * Update an existing customer and customer details
     *
     * @param id The ID of the customer (required)
     * @param customer  (required)
     * @return Customer updated successfully (status code 200)
     *         or Invalid input (status code 400)
     *         or Resource not found (status code 404)
     * @see CustomerApi#updateCustomer
     */
    default ResponseEntity<Customer> updateCustomer(String id,
        Customer customer) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"defaultGeoLocationId\" : \"defaultGeoLocationId\", \"contact\" : { \"zip\" : \"zip\", \"phone\" : \"phone\", \"city\" : \"city\", \"street\" : \"street\", \"state\" : \"state\", \"email\" : \"email\" }, \"name\" : \"name\", \"id\" : \"id\", \"localityId\" : \"localityId\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
