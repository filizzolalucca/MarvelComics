package com.example.mycomicsmarvellist.home.entity

data class ComicBookList(
    val code: Long,
    val status: String,
    val copyright: String,
    val attributionText: String,
    val attributionHTML: String,
    val etag: String,
    val data: Data
)

data class Data (
    val offset: Long,
    val limit: Long,
    val total: Long,
    val count: Long,
    val results: List<ResultAD>
)

data class ResultAD (
    val id: Long,
    val digitalID: Long,
    val title: String,
    val issueNumber: Long,
    val variantDescription: String,
    val description: String? = null,
    val modified: String,
    val isbn: String,
    val upc: String,
    val diamondCode: DiamondCode,
    val ean: String,
    val issn: String,
    val format: Format,
    val pageCount: Long,
    val textObjects: List<TextObject>,
    val resourceURI: String,
    val urls: List<URL>,
    val series: Series,
    val variants: List<Series>,
    val collections: List<Any?>,
    val collectedIssues: List<Series>,
    val dates: List<Date>,
    val prices: List<Price>,
    val thumbnail: Thumbnail,
    val images: List<Thumbnail>,
    val creators: Creators,
    val characters: Characters,
    val stories: Stories,
    val events: Characters
)

data class Characters (
    val available: Long,
    val collectionURI: String,
    val items: List<Series>,
    val returned: Long
)

data class Series (
    val resourceURI: String,
    val name: String
)

data class Creators (
    val available: Long,
    val collectionURI: String,
    val items: List<CreatorsItem>,
    val returned: Long
)

data class CreatorsItem (
    val resourceURI: String,
    val name: String,
    val role: Role
)

enum class Role {
    Colorist,
    Editor,
    Inker,
    Letterer,
    Penciler,
    Penciller,
    PencillerCover,
    Writer
}

data class Date (
    val type: DateType,
    val date: String
)

enum class DateType {
    FocDate,
    OnsaleDate
}

enum class DiamondCode {
    Empty,
    Jul190068
}

enum class Format {
    Comic,
    Digest,
    Empty,
    TradePaperback
}

data class Thumbnail (
    val path: String,
    val extension: Extension
)

enum class Extension {
    Jpg
}

data class Price (
    val type: PriceType,
    val price: Double
)

enum class PriceType {
    PrintPrice
}

data class Stories (
    val available: Long,
    val collectionURI: String,
    val items: List<StoriesItem>,
    val returned: Long
)

data class StoriesItem (
    val resourceURI: String,
    val name: String,
    val type: ItemType
)

enum class ItemType {
    Cover,
    InteriorStory,
    Promo
}

data class TextObject (
    val type: TextObjectType,
    val language: Language,
    val text: String
)

enum class Language {
    EnUs
}

enum class TextObjectType {
    IssueSolicitText
}

data class URL (
    val type: URLType,
    val url: String
)

enum class URLType {
    Detail,
    Purchase
}
