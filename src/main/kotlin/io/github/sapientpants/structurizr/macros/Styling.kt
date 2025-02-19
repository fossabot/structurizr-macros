package io.github.sapientpants.structurizr.macros

import com.structurizr.model.Tags
import com.structurizr.view.Shape
import com.structurizr.view.ViewSet

object Styling {
    const val DATABASE_TAG = "Database"
    const val MOBILE_DEVICE_PORTRAIT_TAG = "Mobile Device Portrait"
    const val SYSTEM_OF_INTEREST_TAG = "System of Interest"
    const val WEB_BROWSER_TAG = "Web Browser"

    fun apply(views: ViewSet) {
        val styles = views.configuration.styles
        styles.addElementStyle(Tags.ELEMENT)
            .color("#ffffff")
        styles.addElementStyle(Tags.SOFTWARE_SYSTEM)
            .color("#000000")
        styles.addElementStyle(SYSTEM_OF_INTEREST_TAG)
            .background("#1168bd")
            .color("#ffffff")
        styles.addElementStyle(Tags.CONTAINER)
            .background("#438dd5")
        styles.addElementStyle(Tags.COMPONENT)
            .background("#85bbf0")
            .color("#000000")
        styles.addElementStyle(Tags.PERSON)
            .background("#08427b")
            .shape(Shape.Person)
            .fontSize(22)

        styles.addElementStyle(DATABASE_TAG)
            .shape(Shape.Cylinder)
        styles.addElementStyle(MOBILE_DEVICE_PORTRAIT_TAG)
            .shape(Shape.MobileDevicePortrait)
        styles.addElementStyle(WEB_BROWSER_TAG)
            .shape(Shape.WebBrowser)
    }
}