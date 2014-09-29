/**
 * This file is part of bagarino.
 *
 * bagarino is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * bagarino is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with bagarino.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.bagarino.model.modification;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.bagarino.model.transaction.PaymentProxy;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Getter
public class EventModification {

    private final Integer id;
    private final String shortName;
    private final int organizationId;
    private final String location;
    private final String description;
    private final DateTimeModification start;
    private final DateTimeModification end;
    private final BigDecimal price;
    private final String currency;
    private final int seats;
    private final BigDecimal vat;
    private final boolean vatIncluded;
    private final List<PaymentProxy> paymentProxies;
    private final List<TicketCategoryModification> ticketCategories;
    private final boolean freeOfCharge;

    @JsonCreator
    public EventModification(@JsonProperty("id") Integer id,
                             @JsonProperty("shortName") String shortName,
                             @JsonProperty("organizationId") int organizationId,
                             @JsonProperty("location") String location,
                             @JsonProperty("description") String description,
                             @JsonProperty("start") DateTimeModification start,
                             @JsonProperty("end") DateTimeModification end,
                             @JsonProperty("price") BigDecimal price,
                             @JsonProperty("currency") String currency,
                             @JsonProperty("seats") int seats,
                             @JsonProperty("vat") BigDecimal vat,
                             @JsonProperty("vatIncluded") boolean vatIncluded,
                             @JsonProperty("paymentProxies") List<PaymentProxy> paymentProxies,
                             @JsonProperty("ticketCategories") List<TicketCategoryModification> ticketCategories,
                             @JsonProperty("freeOfCharge") boolean freeOfCharge) {
        this.id = id;
        this.shortName = shortName;
        this.organizationId = organizationId;
        this.location = location;
        this.description = description;
        this.start = start;
        this.end = end;
        this.price = price;
        this.currency = currency;
        this.seats = seats;
        this.vat = vat;
        this.vatIncluded = vatIncluded;
        this.paymentProxies = Optional.ofNullable(paymentProxies).orElse(Collections.<PaymentProxy>emptyList());
        this.ticketCategories = ticketCategories;
        this.freeOfCharge = freeOfCharge;
    }
}