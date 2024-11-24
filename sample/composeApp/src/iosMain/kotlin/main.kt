import androidx.compose.ui.window.ComposeUIViewController
import com.julenminer.antdesigncmp.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
