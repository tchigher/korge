import com.soywiz.korge.*
import com.soywiz.korge.input.*
import com.soywiz.korge.view.*
import com.soywiz.korim.bitmap.*
import com.soywiz.korim.color.*
import com.soywiz.korim.format.*
import com.soywiz.korio.file.std.*
import kotlin.jvm.*

object Sample1 {
    @JvmStatic
    fun main(args: Array<String>) = Korge(title = "Sample1") {
        //waveEffectView {
        //colorMatrixEffectView(ColorMatrixEffectView.GRAYSCALE_MATRIX) {
        //convolute3EffectView(Convolute3EffectView.KERNEL_EDGE_DETECTION) {
        /*
        blurEffectView(radius = 1.0) {
            convolute3EffectView(Convolute3EffectView.KERNEL_GAUSSIAN_BLUR) {
                //convolute3EffectView(Convolute3EffectView.KERNEL_BOX_BLUR) {
                swizzleColorsEffectView("bgra") {
                    x = 100.0
                    y = 100.0
                    image(Bitmap32(100, 100) { x, y -> RGBA(156 + x, 156 + y, 0, 255) })
                    //solidRect(100, 100, Colors.RED)
                }
                //}
            }
        }.apply {
            tween(this::radius[10.0], time = 5.seconds)
        }
        */

        //val mfilter = ColorMatrixFilter(ColorMatrixFilter.GRAYSCALE_MATRIX, 0.0)
        //val mfilter = WaveFilter()
        //val mfilter = Convolute3Filter(Convolute3Filter.KERNEL_GAUSSIAN_BLUR)
        solidRect(640, 480, Colors.ALICEBLUE)
        image(resourcesVfs["a.png"].readBitmap()) {
            position(50, 50)
        }
        image(Bitmap32(100, 100) { x, y -> RGBA(156 + x, 156 + y, 0, 255) }) {
            x = 100.0
            y = 100.0
            //filter = ComposedFilter(SwizzleColorsFilter("bgra"), SwizzleColorsFilter("bgra"))
            //filter = ComposedFilter(
            //	SwizzleColorsFilter("bgra"),
            //	Convolute3Filter(Convolute3Filter.KERNEL_GAUSSIAN_BLUR),
            //	Convolute3Filter(Convolute3Filter.KERNEL_EDGE_DETECTION)
            //)
            //filter = ComposedFilter(mfilter, Convolute3Filter(Convolute3Filter.KERNEL_GAUSSIAN_BLUR))
            alpha = 1.0
            //filter = mfilter
            //filter = WaveFilter()
        }.apply {
            //mfilter.amplitudeY = 6
            //mfilter.amplitudeX = 0
            //mfilter.time = 0.5
            //tween(mfilter::time[0.0, 10.0], time = 10.seconds)
            //tween(mfilter::blendRatio[0.0, 1.0], time = 4.seconds)
            onClick {
                try {
                    //LaunchReview.launch("com.google.android.apps.maps")
                    //println(Camera.getPicture(Camera.Info()))
                    AdMob.banner.prepare()
                    AdMob.banner.show()
                    //AdMob.rewardvideo.prepare()
                    //AdMob.rewardvideo.show()
                } catch (e: Throwable) {
                    alert("$e")
                }
            }
        }
        //val bmp = SolidRect(100, 100, Colors.RED).renderToBitmap(views)
        //val bmp = view.renderToBitmap(views)
        //bmp.writeTo("/tmp/demo.png".uniVfs, defaultImageFormats)
        //println(bmp)
    }
}

