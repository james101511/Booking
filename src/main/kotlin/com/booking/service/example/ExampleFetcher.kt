package com.booking.service.example

import com.booking.graphql.generated.types.Show
import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsQuery
import com.netflix.graphql.dgs.InputArgument
import reactor.core.publisher.Mono

@DgsComponent
class ExampleFetcher {

    @DgsQuery
    fun shows(@InputArgument titleFilter: String): Mono<Show> {
        return Mono.just(Show(title = "title", releaseYear = 1992))
    }
}